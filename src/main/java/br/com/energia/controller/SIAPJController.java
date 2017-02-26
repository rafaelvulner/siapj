package br.com.energia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.ui.Model;

import br.com.energia.dao.SiapjDAO;
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
			
			SiapjDAO dao = new SiapjDAO();
			
			
			//Pega o nome do arquivo para verificar se é PDF
			String nome = file.getOriginalFilename();
			
			
			String extensao = nome.substring(nome.lastIndexOf("."), nome.length());
			
		
			model.addAttribute("pdf", extensao);
			
			processo.setConteudo(extensao);
			
			try {
				dao.adiciona(processo);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
		}else{
			model.addAttribute("pdf", "Arquivo vazio!");
		}
		
		return "success";
	}


}
