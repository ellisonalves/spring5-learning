package com.ellisonalves.recipeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ellisonalves.recipeapp.repositories.RecipeRepository;

@Controller
public class IndexController {

	private RecipeRepository recipeRepository;

	@Autowired
	public IndexController(RecipeRepository recipeRepository) {
		super();
		this.recipeRepository = recipeRepository;
	}

	@RequestMapping({ "", "/", "/index" })
	public String getIndexPage(Model model) {
		model.addAttribute("recipes", recipeRepository.findAll());

		return "index";
	}

}
