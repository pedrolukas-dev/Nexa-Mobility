package com.example.NexaMobility.service;

import com.example.NexaMobility.entity.FuncionarioEntity;
import com.example.NexaMobility.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository repository;

    public List<FuncionarioEntity> listaTodos(){
        return repository.finAll();
    }
    public FuncionarioEntity salvar(FuncionarioEntity funcionario){
        return repository.save(funcionario);
    }
}
