package com.example.NexaMobility.service;

import com.example.NexaMobility.entity.SeguroEntity;
import com.example.NexaMobility.repository.SeguroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SeguroService {

    private final SeguroRepository repository;

    public SeguroService(SeguroRepository repository) {
        this.repository = repository;
    }

    public List<SeguroEntity> listarTodos() {
        return repository.findAll();
    }

    public Optional<SeguroEntity> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public SeguroEntity salvar(SeguroEntity seguro) {
        return repository.save(seguro);
    }

    public Optional<SeguroEntity> atualizar(Long id, SeguroEntity seguro) {
        return repository.findById(id).map(atual -> {
            atual.setNumeroApolice(seguro.getNumeroApolice());
            atual.setTipo(seguro.getTipo());
            atual.setValorPremio(seguro.getValorPremio());
            atual.setDataInicio(seguro.getDataInicio());
            atual.setDataFim(seguro.getDataFim());
            atual.setStatus(seguro.getStatus());
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
