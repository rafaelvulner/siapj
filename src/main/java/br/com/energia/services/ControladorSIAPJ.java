package br.com.energia.services;

import br.com.energia.dominio.Processo;
import br.com.energia.interfaces.RepositorioProcessos;
import br.com.energia.interfaces.ServicoEmail;
import br.com.energia.interfaces.ValidadorProcesso;

public class ControladorSIAPJ implements RepositorioProcessos, ServicoEmail, ValidadorProcesso{



	@Override
	public boolean validadorProcesso(Processo processo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sendEmail(String address) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addProcesso(Processo processo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Processo getProcesso(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Processo checkProcesso(Processo processo){
		
		return processo;
	}
	
	private boolean persistprocesso(Processo processo){
		
		return false;
	}
	
	private void sendInfoByEmail(Processo processo, boolean statusProcesso){}

}
