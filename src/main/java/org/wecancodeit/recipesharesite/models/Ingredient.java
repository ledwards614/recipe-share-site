package org.wecancodeit.recipesharesite.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity 
public class Ingredient {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private double amount;
	private String measurementType;
	@ManyToOne
	private Recipe recipe;

	public Ingredient(String name, double amount, String measurementType) {
		this.name = name;
		this.amount = amount;
		this.measurementType = measurementType;
	}

	public String getName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}

	public String getMeasurementType() {
		return measurementType;
	}

	public Long getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Ingredient [name=" + name + ", amount=" + amount + ", measurementType=" + measurementType + "]";
	}


	

}
