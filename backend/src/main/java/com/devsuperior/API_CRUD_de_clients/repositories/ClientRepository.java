package com.devsuperior.API_CRUD_de_clients.repositories;

import com.devsuperior.API_CRUD_de_clients.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}

