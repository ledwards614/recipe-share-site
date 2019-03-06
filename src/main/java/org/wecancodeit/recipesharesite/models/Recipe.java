package org.wecancodeit.recipesharesite.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Recipe {

@Id
@GeneratedValue
private Long id;
private String title;
private String directions;
@OneToMany(mappedBy="recipe")
private Collection<Ingredient> ingredientList;
//will need to abstract this into a user class
private String user;
	public Recipe(String title, String directions, Collection<Ingredient> ingredientList) {
		
		this.title = title;
		this.directions = directions;
	    this.ingredientList = ingredientList;
		//this.author = author; maybe add this later
	}
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getDirections() {
		return directions;
	}
	public String getAuthor() {
		return user;
	}
	public Collection<Ingredient> getIngredients() {
		return ingredientList;
	}
	public void addIngredient(Ingredient ingredient) {
		ingredientList.add(ingredient);
	}
	public void removeIngredient(Ingredient ingred) {
		//maybe change to remove by name
		ingredientList.remove(ingred);
	}
	public int ingredientListSize() {
		return ingredientList.size();
	}

	

}
