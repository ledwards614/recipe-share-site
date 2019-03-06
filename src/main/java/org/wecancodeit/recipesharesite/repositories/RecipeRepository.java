package org.wecancodeit.recipesharesite.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.recipesharesite.models.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
	Recipe findRecipeByTitle(String title);
}
