package br.com.energia.interfaces;

import br.com.energia.dominio.Processo;

public interface RepositorioProcessos {
	
	public boolean addProcesso(Processo processo);
	public Processo getProcesso(int id);

}
