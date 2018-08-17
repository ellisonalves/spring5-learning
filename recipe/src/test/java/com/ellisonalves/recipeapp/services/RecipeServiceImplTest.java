package com.ellisonalves.recipeapp.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.ellisonalves.recipeapp.domain.Recipe;
import com.ellisonalves.recipeapp.repositories.RecipeRepository;

@RunWith(MockitoJUnitRunner.class)
public class RecipeServiceImplTest {

	@InjectMocks
	private RecipeServiceImpl recipeService;

	@Mock
	private RecipeRepository recipeRepository;

	@Test
	public void getRecipes() {
		Recipe recipe = new Recipe();

		when(recipeRepository.findAll()).thenReturn(Arrays.asList(recipe));

		Set<Recipe> recipes = recipeService.getRecipes();

		assertEquals(1, recipes.size());

		verify(recipeRepository).findAll();
	}

}
