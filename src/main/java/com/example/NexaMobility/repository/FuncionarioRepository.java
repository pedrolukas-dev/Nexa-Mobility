package com.example.NexaMobility.repository;

import com.example.NexaMobility.entity.FuncionarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FuncionarioRepository extends JpaRepository<FuncionarioEntity, Long> {
    Optional<FuncionarioRepository> findByPlaca(String matricula);}