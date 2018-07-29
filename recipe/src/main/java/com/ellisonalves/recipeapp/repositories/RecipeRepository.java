package com.ellisonalves.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ellisonalves.recipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
