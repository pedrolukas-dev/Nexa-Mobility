package com.example.NexaMobility.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Entity
@Table (name = "tab_moto")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class MotoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String marca;
    @Column(nullable = false)
    private String modelo;
    @Column(nullable = false)
    private String ano;
    @Column(nullable = false)
    private String placa;
    @Column(nullable = false)
    private String cilindradas;
    @Column(nullable = false)
    private String cor;


}
