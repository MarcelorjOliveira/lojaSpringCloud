package br.com.alura.microservice.loja.controller.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.microservice.loja.model.Compra;

@Repository
public interface CompraRepository extends CrudRepository<Compra, Long>
{

}
