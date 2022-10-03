package com.robert.fruityloops.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.robert.fruityloops.models.Item;


@Controller
public class ItemController {
 
 @RequestMapping("/home")
 public String index(Model model) {
     
     ArrayList<Item> fruits = new ArrayList<Item>();
     fruits.add(new Item("Kiwi", 1.5));
     fruits.add(new Item("Mango", 2.0));
     fruits.add(new Item("Goji Berries", 4.0));
     fruits.add(new Item("Guava", .75));
     
     model.addAttribute("fruit", fruits);
     
     // Add fruits your view model here
     
     return "index.jsp";
 }
}

