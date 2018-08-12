package com.ellisonalves.recipeapp.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(exclude = "recipe")
@Entity
public class Ingredient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String description;

	@Column
	private BigDecimal amount;

	@OneToOne(fetch = FetchType.EAGER)
	private UnitOfMeasure unitOfMeasure;

	@ManyToOne
	private Recipe recipe;

	public Ingredient(String description, BigDecimal amount, UnitOfMeasure unitOfMeasure) {
		super();
		this.description = description;
		this.amount = amount;
		this.unitOfMeasure = unitOfMeasure;
	}

}
