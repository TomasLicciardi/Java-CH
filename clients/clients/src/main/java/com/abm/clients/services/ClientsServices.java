package com.abm.clients.services;


import com.abm.clients.entities.Client;
import com.abm.clients.repositories.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientsServices {

    @Autowired private ClientsRepository repository;

    public Client save(Client client) {
        return repository.save(client);
    }

    public Optional<Client> findById(Long id) {
        return repository.findById(id);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public List<Client> findAll() {
        return repository.findAll();
    }

}
