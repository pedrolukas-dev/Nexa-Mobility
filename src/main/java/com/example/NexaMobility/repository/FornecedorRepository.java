package com.example.NexaMobility.repository;

import com.example.NexaMobility.entity.FornecedorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends JpaRepository<FornecedorEntity, Long> {
}
