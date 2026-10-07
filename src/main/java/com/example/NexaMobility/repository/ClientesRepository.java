package com.example.NexaMobility.repository;

import com.example.NexaMobility.entity.ClientesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientesRepository extends JpaRepository<ClientesEntity, Long> {
    Optional<ClientesRepository> findByPlaca(String nome);
}