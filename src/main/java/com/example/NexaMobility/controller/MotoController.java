package com.example.NexaMobility.controller;


import com.example.NexaMobility.entity.MotoEntity;
import com.example.NexaMobility.repository.CarroRepository;
import com.example.NexaMobility.repository.MotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping ("/moto")
public class MotoController {
    @Autowired
    private MotoRepository repository;

    @GetMapping
    public List<MotoEntity> listarTodos(){
        return repository.findAll();
    }
    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@RequestBody MotoEntity moto){
        repository.save(moto);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "moto cadastrada!"));
    }
}
