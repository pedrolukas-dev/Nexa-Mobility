package com.example.NexaMobility.repository;

import com.example.NexaMobility.entity.CarroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarroRepository extends JpaRepository<CarroEntity, Long> {

    Optional<CarroRepository> findByPlaca(String placa);
}
