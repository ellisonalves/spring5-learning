package com.ellisonalves.recipeapp.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String description;

	@Column
	private Integer prepTime;

	@Column
	private Integer cookTime;

	@Column
	private Integer servings;

	@Column
	private String source;

	@Column
	private String url;

	@Lob
	private String directions;

	@Enumerated(EnumType.STRING)
	private Difficulty difficulty;

	@OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
	private Set<Ingredient> ingredients;

	@Lob
	private Byte[] image;

	@OneToOne(cascade = CascadeType.ALL)
	private Notes notes;

	@ManyToMany
	@JoinTable(name = "recipe_category", joinColumns = @JoinColumn(name = "recipe_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
	private Set<Category> categories;

	public void addIngredient(Ingredient ingredient) {
		ingredients.add(ingredient);
		ingredient.setRecipe(this);
	}

	public void addCategory(Category category) {
		categories.add(category);
	}

}