package br.com.mac.padroes.repository;

import br.com.mac.padroes.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}