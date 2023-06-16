package com.exameninterciclo.Pauta_Esteban.controller;

import java.util.List;

import com.exameninterciclo.Pauta_Esteban.entity.ClienteEntity;
import com.exameninterciclo.Pauta_Esteban.repository.ClienteRepository;
import com.exameninterciclo.Pauta_Esteban.service.ClienteService;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/ex_clientes")
public class ClienteController {

    private final ClienteService clienteService;
    private final ClienteRepository clienteRepository;

    public ClienteController(ClienteService clienteService, ClienteRepository clienteRepository) {
        this.clienteService = clienteService;
        this.clienteRepository = clienteRepository;
    }

    @PostMapping
    public ClienteEntity createCliente(@RequestBody ClienteEntity clienteentity) {
        return clienteService.createCliente(clienteentity);
    }

    @GetMapping("/{id}")
    public ClienteEntity getClienteEntityById(@PathVariable Integer id) {
        return clienteService.getClienteEntityById(id);
    }
    @PutMapping("/{id}")
    public ClienteEntity actualizarcliente(@PathVariable Integer id, @RequestBody ClienteEntity nuevocliente){
        ClienteEntity cliente = clienteRepository.findById(id).orElseThrow(()->new RuntimeException("No existe Cliente"));
        cliente.setNombre(nuevocliente.getNombre());
        cliente.setEmail(nuevocliente.getEmail());
        cliente.setTelefono(nuevocliente.getTelefono());

        return clienteRepository.save(cliente);
    }

    @DeleteMapping("/{id}")
    public void eliminarCliente(@PathVariable Integer id){
        ClienteEntity cliente = clienteRepository.findById(id).orElseThrow(()->new RuntimeException("No existe Cliente"));

        clienteRepository.delete(cliente);
    }

    @GetMapping
    public List<ClienteEntity> findAll(){
        return clienteService.findAll();
    }

}