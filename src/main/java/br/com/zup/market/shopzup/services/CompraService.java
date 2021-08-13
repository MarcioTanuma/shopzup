package br.com.zup.market.shopzup.services;

import br.com.zup.market.shopzup.dtos.CompraDTO;
import br.com.zup.market.shopzup.dtos.ProdutoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompraService {
    private List<CompraDTO> listaDeCompras = new ArrayList<>();

    @Autowired
    private ClienteService clienteService;
    @Autowired
    private ProdutoService produtoService;

    // Método para cadastrar compras
    public CompraDTO cadastrarCompras(CompraDTO compraDTO) {

        // Criando listas de produtos
        List<ProdutoDTO>produtos = compraDTO.getProdutos();
        List<ProdutoDTO>objProdutos = new ArrayList<>();

        // Verificando se o CPF existe e atribuindo cliente para a variável objCliente
        compraDTO.setCliente(clienteService.buscarClientesPorCpf(compraDTO.getCliente().getCpf()));

        for (ProdutoDTO produto:produtos) {
            objProdutos.add(produtoService.buscarProdutoPorNome(produto.getNome()));
        }
        compraDTO.setProdutos(objProdutos);
        listaDeCompras.add(compraDTO);
        return compraDTO;
    }
    // Método para listar compras
    public List<CompraDTO> mostrarCompras() {
        return listaDeCompras;
    }

}

