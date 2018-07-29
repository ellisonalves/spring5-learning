package com.ellisonalves.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ellisonalves.recipeapp.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
