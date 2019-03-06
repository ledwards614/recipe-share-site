package org.wecancodeit.recipesharesite;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.recipesharesite.models.Ingredient;
import org.wecancodeit.recipesharesite.models.Recipe;
import org.wecancodeit.recipesharesite.repositories.IngredientRepository;
import org.wecancodeit.recipesharesite.repositories.RecipeRepository;

@Service
public class Initializer implements CommandLineRunner {
//	@Resource
//	IngredientRepository ingredRepo;
	@Resource
	RecipeRepository recipeRepo;
	@Override
	public void run(String... args) throws Exception {
		
		//create ingredients to add to the recipe
		Ingredient ingredientOne = new Ingredient("bread", 2, "slices");
		Ingredient ingredientTwo = new Ingredient("peanut butter", 2, "tablespoons");
		Ingredient ingredientThree = new Ingredient("jelly", 2, "tablespoons");
		//create and ingredient list
		ArrayList<Ingredient> recipeOneIngredients = new ArrayList<>();
		//add ingredients to list
		//may not be necessary with Repositories
		recipeOneIngredients.add(ingredientOne);
		recipeOneIngredients.add(ingredientTwo);
		recipeOneIngredients.add(ingredientThree);
		//create recipe
		String pbAndJDirections = "Apply peanut butter to one slice of bread, apply jelly to other slice of bread, combine slices and cut bread in half";
		//ingredRepo.saveAll(recipeOneIngredients);
		Recipe pbandJ = new Recipe("Peanut Butter and Jelly Sandwich", pbAndJDirections, recipeOneIngredients);
		recipeRepo.save(pbandJ);
	}

}
