package br.com.zup.market.shopzup.services;

import br.com.zup.market.shopzup.dtos.ProdutoDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {
    private List<ProdutoDTO> listaDeProdutos = new ArrayList<>();

    // Método para cadastrar produtos
        public ProdutoDTO cadastrarProduto(ProdutoDTO produto){
            validaProdutoDuplicado(produto);
            listaDeProdutos.add(produto);
            return produto;
    }
    // Método para validar produto cadastrado
    public void validaProdutoDuplicado(ProdutoDTO produtoDTO){
        for (ProdutoDTO item:listaDeProdutos) {
            if (item.getNome().equals(produtoDTO.getNome())){
                throw new RuntimeException("Produto duplicado!");
            }

        }
    }
    // Método para mostrar produtos cadastrados na lista
    public List<ProdutoDTO> mostrarListaDeProdutos(){
            return listaDeProdutos;
    }
}
