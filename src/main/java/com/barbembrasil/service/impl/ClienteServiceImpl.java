package com.barbembrasil.service.impl;




import org.springframework.stereotype.Service;

import com.barbembrasil.domain.model.Cliente;
import com.barbembrasil.domain.repository.ClienteRepository;
import com.barbembrasil.service.ClienteService;

import java.util.NoSuchElementException;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente findById(Long id) {
        return clienteRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Cliente create(Cliente clienteCriado) {
        if (clienteRepository.existsById(clienteCriado.getId())) {
            throw new IllegalArgumentException("This request number already exists.");
        }
        return clienteRepository.save(clienteCriado);
    }
}