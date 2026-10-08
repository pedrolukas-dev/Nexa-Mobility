package com.example.NexaMobility.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteRequestDTO {

    @NotBlank(message = "O nome é Obrigatorio.")
    @Size(min = 3,message = "O nome deve ter no minimo 3 caracteres.")
    private String nome;
    @NotBlank(message = "O E-mail é Obrigatorio.")
    @Email (message = "Deve ser um e-mail válido.")
    @Size (max = 200, message = "O e-mail deve ter no máximo 200 caracteres")
    private String email;
    @NotBlank(message = "O Telefone é Obrigatorio.")
    @Size(min = 11, max =15, message = "O telefone deve ter entre 11 a 15 caracteres.")
    private String telefone;

    public ClienteRequestDTO(String name) {
    }
}
