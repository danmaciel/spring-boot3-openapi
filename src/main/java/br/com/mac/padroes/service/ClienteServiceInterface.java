package br.com.mac.padroes.service;

import br.com.mac.padroes.model.Cliente;

public interface ClienteServiceInterface {
    Iterable<Cliente> getAll();
    Cliente getById(Long id);
    Cliente create(Cliente cliente);
    Cliente update(Long id, Cliente cliente);
    boolean delete(Long id);
}
