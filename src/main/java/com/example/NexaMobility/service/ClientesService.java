package com.example.NexaMobility.service;

import com.example.NexaMobility.dto.ClienteRequestDTO;
import com.example.NexaMobility.dto.ClienteResponseDTO;
import com.example.NexaMobility.entity.ClientesEntity;
import com.example.NexaMobility.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository repository;

    public List<ClienteResponseDTO> listaTodos() {
        return repository.findAll()
                .stream()
                .map(c -> {
                    ClienteResponseDTO dto = new ClienteResponseDTO();
                    dto.setNome(c.getNome());
                    return dto;
                })
                .collect(Collectors.toList());
    }

    public ClientesEntity salvarCliente(ClienteRequestDTO dto){

        if (repository.findByEmail(dto.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Cliente já cadastrado com este e-mail.");
        }

        ClientesEntity novoCliente = new ClientesEntity();
        novoCliente.setNome(dto.getNome());
        novoCliente.setEmail(dto.getEmail());
        novoCliente.setTelefone(dto.getTelefone());

        return repository.save(novoCliente);
    }
}