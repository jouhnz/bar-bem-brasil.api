package com.barbembrasil.service;

import com.barbembrasil.domain.model.Cliente;

public interface ClienteService {

    Cliente findById(Long id);

    Cliente create(Cliente userToCreate);
}