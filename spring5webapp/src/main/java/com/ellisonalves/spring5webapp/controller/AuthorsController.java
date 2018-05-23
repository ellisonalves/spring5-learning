package com.ellisonalves.spring5webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ellisonalves.spring5webapp.repository.AuthorRepository;

@Controller
public class AuthorsController {

	private AuthorRepository authorRepository;

	public AuthorsController(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

	@RequestMapping("/authors")
	public String getAuthors(Model model) {
		model.addAttribute("authors", authorRepository.findAll());
		return "authors";
	}

}
