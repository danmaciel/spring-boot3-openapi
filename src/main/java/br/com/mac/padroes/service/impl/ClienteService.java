package br.com.mac.padroes.service.impl;

import br.com.mac.padroes.model.Cliente;
import br.com.mac.padroes.repository.ClienteRepository;
import br.com.mac.padroes.service.ClienteServiceInterface;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements ClienteServiceInterface {
    final ClienteRepository _repository;

    public ClienteService(ClienteRepository repository){
        _repository = repository;
    }
    @Override
    public Iterable<Cliente> getAll() {
        return _repository.findAll();
    }

    @Override
    public Cliente getById(Long id) {
       final var result = _repository.findById(id);
        return result.orElse(null);
    }

    @Override
    public Cliente create(Cliente cliente) {
        return _repository.save(cliente);
    }

    @Override
    public Cliente update(Long id, Cliente cliente) {
        return _repository.save(cliente);
    }

    @Override
    public boolean delete(Long id) {
        _repository.deleteById(id);
        return getById(id) == null;
    }
}
