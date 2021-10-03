package com.devsuperior.dsclient.dsclient.services;

import com.devsuperior.dsclient.dsclient.dto.ClientDTO;
import com.devsuperior.dsclient.dsclient.entities.Client;
import com.devsuperior.dsclient.dsclient.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAllPaged(PageRequest pageRequest){
        Page<Client> list = clientRepository.findAll(pageRequest);
        return list.map(x -> new ClientDTO(x));
    }

//    @Transactional(readOnly = true)
//    public ClientDTO findById(Long id) {
//        Optional<Client> obj = clientRepository.findById(id);
//    }
}
