package com.example.NexaMobility.service;

import com.example.NexaMobility.entity.ClientesEntity;
import com.example.NexaMobility.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository repository;

    public List<ClientesEntity> listaTodos() {
        return repository.findAll();
    }

    public ClientesEntity salvar(ClientesEntity clientes) {
        return repository.save(clientes);
    }
}