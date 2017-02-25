package br.com.energia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.ui.Model;

import br.com.energia.dominio.Processo;


@Controller
public class SIAPJController {
	
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
			
		}else{
			model.addAttribute("erro", "Arquivo vazio!");
		}
		
		return "success";
	}


}
