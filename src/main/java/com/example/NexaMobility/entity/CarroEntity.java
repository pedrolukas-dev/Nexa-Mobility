package com.example.NexaMobility.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "tab_carro")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CarroEntity {

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
    private String cor;
    @Column(nullable = false)
    private String numeroPortas;



}
