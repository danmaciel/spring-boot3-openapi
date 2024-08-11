package br.com.mac.padroes.controller;

import br.com.mac.padroes.model.Cliente;
import br.com.mac.padroes.service.ClienteServiceInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clientes")
public class ClienteController {

    final ClienteServiceInterface _service;

    public ClienteController(ClienteServiceInterface service) {
        _service = service;
    }

    @GetMapping()
    public ResponseEntity<Iterable<Cliente>> getAll(){
        return ResponseEntity.ok(_service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getById(@PathVariable long id){
        final var result = _service.getById(id);
        return result != null ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }

    @PostMapping()
    public ResponseEntity<Cliente> create(@RequestBody Cliente cliente){
        return ResponseEntity.ok(_service.create(cliente));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> update(@PathVariable long id, @RequestBody Cliente cliente){
        return ResponseEntity.ok(_service.update(id, cliente));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id){
        boolean result = _service.delete(id);
        return result ? ResponseEntity.ok().build() : ResponseEntity.unprocessableEntity().build() ;
    }
}
