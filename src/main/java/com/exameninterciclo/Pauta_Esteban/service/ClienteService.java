package com.exameninterciclo.Pauta_Esteban.service;

import com.exameninterciclo.Pauta_Esteban.entity.ClienteEntity;
import com.exameninterciclo.Pauta_Esteban.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {

        this.clienteRepository = clienteRepository;
    }

    public ClienteEntity createCliente(ClienteEntity clienteEntity) {
        return clienteRepository.save(clienteEntity);
    }

    public ClienteEntity getClienteEntityById(Integer id) {
        return clienteRepository.findById(id).get();
    }

    public List<ClienteEntity> findAll(){
        return clienteRepository.findAll();
    }


}