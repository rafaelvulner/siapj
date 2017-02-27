package br.com.energia.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.com.energia.dao.SiapjRepository;
import br.com.energia.dominio.Processo;

@Service
@Transactional
public class SiapjService {
	
	private final SiapjRepository repository;

	public SiapjService(SiapjRepository repository) {
		this.repository = repository;
	}
	
	public void salvar(Processo processo){
		repository.save(processo);
		
	}

}
