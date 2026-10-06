package com.example.NexaMobility.controller;


import com.example.NexaMobility.entity.FuncionarioEntity;
import com.example.NexaMobility.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
@Autowired
    private FuncionarioRepository repository;
@GetMapping
    public List<FuncionarioRepository> listarTodos(){
    return repository.findAll();
}
@PostMapping
    public ResponseEntity<Map<String,Object>>salvar (@RequestBody FuncionarioEntity funcionario){
    repository.save(funcionario);

    return  ResponseEntity
            .status(HttpStatus.CREATED)
            .body(Map.of("mensagem","Funcioanrio Cadastrado!"));
}
}
