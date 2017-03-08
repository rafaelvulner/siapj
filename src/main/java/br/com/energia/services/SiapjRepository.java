package br.com.energia.services;

import org.springframework.data.repository.CrudRepository;

import br.com.energia.dominio.Processo;

public interface SiapjRepository extends CrudRepository<Processo, Integer>{

}
