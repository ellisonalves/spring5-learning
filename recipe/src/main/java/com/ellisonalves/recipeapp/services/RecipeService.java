package com.ellisonalves.recipeapp.services;

import java.util.Set;

import com.ellisonalves.recipeapp.domain.Recipe;

public interface RecipeService {

	public Set<Recipe> getRecipes();

}
