package com.amazon.amazonproject.ModelPack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class itemclass
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String laptopbrand;

	
	public String getLaptopbrand() {
		return laptopbrand;
	}
	public void setLaptopbrand(String laptopbrand) {
		this.laptopbrand = laptopbrand;
	}

	public int getId() {
		return id;
	}	
}
