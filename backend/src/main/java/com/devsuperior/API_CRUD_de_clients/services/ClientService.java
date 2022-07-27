package com.devsuperior.API_CRUD_de_clients.services;

import com.devsuperior.API_CRUD_de_clients.DTO.ClientDTO;
import com.devsuperior.API_CRUD_de_clients.entities.Client;
import com.devsuperior.API_CRUD_de_clients.repositories.ClientRepository;
import com.devsuperior.API_CRUD_de_clients.services.exceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public List<ClientDTO> findAll() {
        List<Client> list = repository.findAll();
        return list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());

    }

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Optional<Client> obj = repository.findById(id);
        Client entity = obj.orElseThrow(() -> new EntityNotFoundException("Objeto não encontrado! Id: " + id));
        return new ClientDTO(entity);
    }
}
