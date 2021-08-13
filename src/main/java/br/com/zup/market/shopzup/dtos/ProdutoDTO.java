package br.com.zup.market.shopzup.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ProdutoDTO {
    @NotBlank(message = "Preenchimento do campo Nome do Produto é obrigatório!")
    private String nome;
    @NotBlank(message = "Preenchimento do Valor do Produto é obrigatório!")
    private double preco;
    @NotBlank(message = "Preenchimento da Quantidade de Produto(s) é obrigatório!")
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
