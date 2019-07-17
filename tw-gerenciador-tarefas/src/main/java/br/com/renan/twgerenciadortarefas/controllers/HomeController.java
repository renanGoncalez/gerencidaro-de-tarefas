package br.com.renan.twgerenciadortarefas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

//Aogara o Spring sabe que essa classe é uma controller
@Controller
public class HomeController {

	//metodo get, vertbo http get,Get indica que eu quero ler algo no servidor de aplicação
	// metodo Get devolve algo
	@GetMapping("/")
	public ModelAndView home() 
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home/home");
		mv.addObject("mensagem", "Mensagem do Controller");
		
		return mv;
	}
	
}
