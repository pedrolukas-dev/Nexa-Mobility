package com.example.NexaMobility.controller;

import com.example.NexaMobility.dto.ClienteRequestDTO;
import com.example.NexaMobility.dto.ClienteResponseDTO;
import com.example.NexaMobility.entity.ClientesEntity;
import com.example.NexaMobility.repository.ClientesRepository;
import com.example.NexaMobility.service.ClientesService;
import jakarta.validation.Valid;
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
    private ClientesService service;

    @GetMapping
    public  ResponseEntity<List<ClienteResponseDTO>>listar(){
        return ResponseEntity
                .ok()
                .body(service.listaTodos());
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> salvar(@Valid @RequestBody ClienteRequestDTO dto) {
       service.salvarCliente(dto);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "cliente cadastrado!"));
    }
}