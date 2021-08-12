package br.com.zup.market.shopzup.services;

import br.com.zup.market.shopzup.dtos.ClienteDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {
    private List<ClienteDTO> listaDeClientes = new ArrayList<>();

    // Método para cadastrar Clientes
    public ClienteDTO cadastrarClientes(ClienteDTO cliente){
        listaDeClientes.add(cliente);
        return cliente;
    }
    // Método para buscar clientes por CPF
    public ClienteDTO buscarClientesPorCpf(String cpf){
        for (ClienteDTO objCliente:listaDeClientes) {
            if (objCliente.getCpf().equals(cpf)) {
                return objCliente;
            }
        }
        throw new RuntimeException("Cliente não encontrado!");
    }
}
