package com.ellisonalves.recipeapp.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ellisonalves.recipeapp.domain.Category;
import com.ellisonalves.recipeapp.domain.UnitOfMeasure;
import com.ellisonalves.recipeapp.repositories.CategoryRepository;
import com.ellisonalves.recipeapp.repositories.UnitOfMeasureRepository;

@Controller
public class IndexController {

	private CategoryRepository categoryRepository;

	private UnitOfMeasureRepository unitOfMeasureRepository;

	@Autowired
	public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
		super();
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
	}

	@RequestMapping({ "", "/", "/index" })
	public String getIndexPage() {
		Optional<Category> categoryOptional = categoryRepository.findByDescription("American");

		Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

		System.out.println("Cat Id is: " + categoryOptional.get().getId());
		System.out.println("Unit Of Measure Id is: " + unitOfMeasureOptional.get().getId());

		return "index";
	}

}
