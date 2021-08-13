package br.com.zup.market.shopzup.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ClienteDTO {
    @NotBlank(message = "Preenchimento do campo Nome é obrigatório!")
    private String nome;
    @Size(min = 11, max = 11, message = "Campo CPF obrigatório com 11 posições!")
    private String cpf;
    @Email(message = "e-mail cadastrado NÃO é válido!")
    @NotBlank(message = "Preenchimento do campo e-mail é obrigatório!")
    private String email;

    public ClienteDTO() {
    }

    public ClienteDTO(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
