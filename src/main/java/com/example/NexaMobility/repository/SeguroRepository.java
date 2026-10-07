package com.example.NexaMobility.repository;

import com.example.NexaMobility.entity.SeguroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SeguroRepository extends JpaRepository<SeguroEntity, Long> {
    Optional<MotoRepository> findByPlaca(String codigoAtivacao);}
