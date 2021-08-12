package br.com.zup.market.shopzup.controllers;

import br.com.zup.market.shopzup.dtos.ClienteDTO;
import br.com.zup.market.shopzup.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteDTO cadastrarCliente(@RequestBody ClienteDTO cliente) {
        return clienteService.cadastrarClientes(cliente);
    }
}
