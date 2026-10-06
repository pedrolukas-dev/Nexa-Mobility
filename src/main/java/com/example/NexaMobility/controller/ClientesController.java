package com.example.NexaMobility.controller;

import com.example.NexaMobility.entity.ClientesEntity;
import com.example.NexaMobility.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    private ClientesRepository repository;

    @GetMapping
    public List<ClientesEntity> listarTodos() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@RequestBody ClientesEntity cliente) {
        repository.save(cliente);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "cliente cadastrado!"));
    }
}