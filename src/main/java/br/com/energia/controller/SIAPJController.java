package br.com.energia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;

import org.springframework.ui.Model;


import br.com.energia.dao.SiapjDAO;
import br.com.energia.dominio.Processo;


@Controller
public class SIAPJController {
	
	@Autowired
	private SiapjDAO service;
	
	@RequestMapping("/index")
	public String index(){
		
		return "index";
	}
	
	@RequestMapping("/formulario")
	public String formulario(@RequestParam("processo") MultipartFile file, Processo processo, Model model){
		
		
		
		if (!file.isEmpty()) {	
			
			
			//Pega o nome do arquivo para verificar se é PDF
			String nome = file.getOriginalFilename();
			
			
			String extensao = nome.substring(nome.lastIndexOf("."), nome.length());
			
		
			model.addAttribute("pdf", extensao);
			
			processo.setConteudo(extensao);
			
			try {
				service.salvar(processo);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
		}else{
			model.addAttribute("pdf", "Arquivo vazio!");
		}
		
		return "success";
	}
	
	
	@RequestMapping("/retorno")
	public @ResponseBody String retornarInfos(){
		
		Gson gson = new Gson();
		
		String retorno = gson.toJson(service.retornarProcesso());
		return retorno;
	}


}
