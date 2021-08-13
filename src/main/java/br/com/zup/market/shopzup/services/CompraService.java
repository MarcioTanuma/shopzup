package br.com.zup.market.shopzup.services;

import br.com.zup.market.shopzup.dtos.CompraDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompraService {
    private List<CompraDTO> listaDeCompras;

    // Método para cadastrar compras
    public CompraDTO cadastrarCompras(CompraDTO compraDTO) {
        listaDeCompras.add(compraDTO);
        return compraDTO;
    }
    // Método para listar compras
    public List<CompraDTO> mostrarCompras() {
        return listaDeCompras;
    }
}

