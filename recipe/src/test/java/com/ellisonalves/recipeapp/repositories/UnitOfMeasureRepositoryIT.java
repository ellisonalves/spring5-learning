package com.ellisonalves.recipeapp.repositories;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ellisonalves.recipeapp.domain.UnitOfMeasure;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIT {

	@Autowired
	private UnitOfMeasureRepository unitOfMeasureRepositoryIT;

	@Before
	public void setup() throws Exception {

	}

	@Test
	public void testFindByDescription() {
		Optional<UnitOfMeasure> findByDescription = unitOfMeasureRepositoryIT.findByDescription("Teaspoon");
		assertEquals("Teaspoon", findByDescription.get().getDescription());
	}

	@Test
	public void testFindByCup() {
		Optional<UnitOfMeasure> findByDescription = unitOfMeasureRepositoryIT.findByDescription("Cup");
		assertEquals("Cup", findByDescription.get().getDescription());
	}

}
