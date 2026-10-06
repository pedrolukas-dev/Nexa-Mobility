package com.example.NexaMobility.repository;

import com.example.NexaMobility.entity.MotoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MotoRepository extends JpaRepository<MotoEntity,Long>{

    Optional<MotoRepository> findByPlaca(String placa);
}
