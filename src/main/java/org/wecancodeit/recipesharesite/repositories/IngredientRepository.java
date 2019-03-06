package org.wecancodeit.recipesharesite.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.recipesharesite.models.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, Long> {

}
