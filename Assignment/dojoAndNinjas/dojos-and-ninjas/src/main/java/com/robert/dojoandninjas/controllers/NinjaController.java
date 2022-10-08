package com.robert.dojoandninjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.robert.dojoandninjas.models.Ninja;
import com.robert.dojoandninjas.services.DojoService;
import com.robert.dojoandninjas.services.NinjaService;

@Controller
public class NinjaController {
	public final NinjaService ninjaServ;
	public final DojoService dojoServ;
	
	public NinjaController(NinjaService ninjaServ,DojoService dojoServ) {
		this.ninjaServ = ninjaServ;
		this.dojoServ = dojoServ;
	}
	

	
	@PostMapping("/create")
	public String processCreateNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "create.jsp";
		}
		ninjaServ.create(ninja);
		return "redirect:/";
		
		
	}
	
	@GetMapping("/create")
	public String createNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {

		model.addAttribute("allDojos", dojoServ.allDojos());
		return "create.jsp";
}
}
