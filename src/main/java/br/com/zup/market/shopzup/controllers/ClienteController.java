package br.com.zup.market.shopzup.controllers;

import br.com.zup.market.shopzup.dtos.ClienteDTO;
import br.com.zup.market.shopzup.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    // Método para cadastrar Cliente
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteDTO cadastrarCliente(@RequestBody @Valid ClienteDTO cliente) {
        return clienteService.cadastrarClientes(cliente);
    }
    // Método para buscar Cliente por CPF
    @GetMapping("{cpf}")
    public ClienteDTO buscarClientePorCpf(@PathVariable String cpf) {
        return clienteService.buscarClientesPorCpf(cpf);
    }

}
