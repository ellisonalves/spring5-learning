package com.ellisonalves.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ellisonalves.recipeapp.domain.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, Long> {

}
