package com.example.NexaMobility.repository;

import com.example.NexaMobility.entity.ClientesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<ClientesEntity, Long> {
}