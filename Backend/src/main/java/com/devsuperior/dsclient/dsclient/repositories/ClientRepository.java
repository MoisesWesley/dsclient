package com.devsuperior.dsclient.dsclient.repositories;

import com.devsuperior.dsclient.dsclient.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
