package br.com.example.atividade.repositorio;

import org.springframework.data.repository.CrudRepository;

import br.com.example.atividade.modelo.Produto;

public interface Repositorio extends CrudRepository<Produto, Integer>{
    
}
