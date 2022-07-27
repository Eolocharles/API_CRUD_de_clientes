package com.devsuperior.API_CRUD_de_clients.resources;

import com.devsuperior.API_CRUD_de_clients.entities.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

    @GetMapping
    public ResponseEntity<List<Client>> findAll(){
        List<Client> list = new ArrayList<>();
        list.add(new Client(1L, "Maria anedilce,",null, null, null, null));
        list.add(new Client(1L, "Ana claudia",null, null, null, null));
        return  ResponseEntity.ok().body(list);

    }
}
