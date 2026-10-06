package com.example.NexaMobility.service;

import com.example.NexaMobility.entity.FornecedorEntity;
import com.example.NexaMobility.repository.FornecedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    private final FornecedorRepository repository;

    public FornecedorService(FornecedorRepository repository) {
        this.repository = repository;
    }

    public List<FornecedorEntity> listarTodos() {
        return repository.findAll();
    }

    public Optional<FornecedorEntity> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public FornecedorEntity salvar(FornecedorEntity fornecedor) {
        return repository.save(fornecedor);
    }

    public Optional<FornecedorEntity> atualizar(Long id, FornecedorEntity fornecedor) {
        return repository.findById(id).map(atual -> {
            atual.setRazaoSocial(fornecedor.getRazaoSocial());
            atual.setCnpj(fornecedor.getCnpj());
            atual.setEmail(fornecedor.getEmail());
            atual.setTelefone(fornecedor.getTelefone());
            atual.setEndereco(fornecedor.getEndereco());
            atual.setCategoria(fornecedor.getCategoria());
            return repository.save(atual);
        });
    }

    public boolean excluir(Long id) {
        if (!repository.existsById(id)) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }
}
