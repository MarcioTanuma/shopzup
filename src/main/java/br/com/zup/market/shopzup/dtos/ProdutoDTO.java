package br.com.zup.market.shopzup.dtos;

import javax.validation.constraints.*;

public class ProdutoDTO {
    @NotBlank(message = "Preenchimento do campo Nome do Produto é obrigatório!")
    private String nome;
    @DecimalMin("0.00")
    private double preco;
    @Min(0)
    private int quantidade;

    public ProdutoDTO() {
    }

    public ProdutoDTO(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
