package com.ellisonalves.recipeapp.controllers;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import com.ellisonalves.recipeapp.domain.Recipe;
import com.ellisonalves.recipeapp.services.RecipeService;

@RunWith(MockitoJUnitRunner.class)
public class IndexControllerTest {

	@InjectMocks
	private IndexController controller;

	@Mock
	private RecipeService recipeService;

	@Mock
	private Model model;

	@Test
	public void testMockMvc() throws Exception {
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();

		mockMvc.perform(get("/"))
			.andExpect(status().isOk())
			.andExpect(view().name("index"));
	}

	@Test
	public void testGetIndexPage() {
		assertEquals("index", controller.getIndexPage(model));

		verify(recipeService).getRecipes();

		ArgumentCaptor<Set<Recipe>> recipesCaptor = ArgumentCaptor.forClass(Set.class);

		verify(model).addAttribute(eq("recipes"), recipesCaptor.capture());

		assertEquals(0, recipesCaptor.getValue().size());
	}

}
