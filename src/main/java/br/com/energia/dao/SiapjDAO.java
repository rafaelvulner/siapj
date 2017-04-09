package br.com.energia.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.com.energia.dominio.Processo;
import br.com.energia.services.SiapjRepository;

@Service
@Transactional
public class SiapjDAO {
	
	private final SiapjRepository repository;

	public SiapjDAO(SiapjRepository repository) {
		this.repository = repository;
	}
	
	public void salvar(Processo processo){
		repository.save(processo);
		
	}
	
	public List<Processo> retornarProcesso(){
		
		return (List<Processo>) repository.findAll();
		
	}

}
