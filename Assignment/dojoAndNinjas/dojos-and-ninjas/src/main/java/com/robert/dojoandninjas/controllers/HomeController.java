package com.robert.dojoandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.robert.dojoandninjas.models.Dojo;
import com.robert.dojoandninjas.services.DojoService;
import com.robert.dojoandninjas.services.NinjaService;
@Controller
public class HomeController {

	
	private DojoService dojoService;
	public final NinjaService ninjaServ;
	public HomeController(DojoService dojoService, NinjaService ninjaServ) {
		this.dojoService = dojoService;
		this.ninjaServ = ninjaServ; 
	}
	
	@GetMapping("/")
	public String home(Model model, 
			@ModelAttribute("dojo") Dojo dojo) {
		model.addAttribute("dojos", dojoService.allDojos());
		return "index.jsp";
}
	@PostMapping("/dojos")
	public String index(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Dojo> dojos = dojoService.allDojos();
			model.addAttribute("dojos", dojos);
			return "index.jsp";
		}else {
			dojoService.createDojo(dojo);
			return "redirect:/";
		}
	}
	
	@GetMapping("/dojos/{dojoId}")
	public String showDojo(@PathVariable("dojoId") Long id, Model model) {

		model.addAttribute("dojo", dojoService.findDojo(id));
		return "showDojo.jsp";
}
}