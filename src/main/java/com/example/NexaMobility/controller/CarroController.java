package com.example.NexaMobility.controller;

import com.example.NexaMobility.entity.CarroEntity;
import com.example.NexaMobility.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping ("/carro")
public class CarroController {

    @Autowired
    private CarroRepository repository;

    @GetMapping
    public List<CarroEntity> listarTodos(){
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(@RequestBody CarroEntity carro){
        repository.save(carro);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "carro cadastrado!"));
    }

}

