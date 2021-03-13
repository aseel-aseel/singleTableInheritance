package com.example.demo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity

@DiscriminatorValue(value="Cars")
public class Cars extends Vehicles{

	private String CarColor;

	public Cars() {}
	public Cars(String carColor) {
		super();
		CarColor = carColor;
	}
	public String getCarColor() {
		return CarColor;
	}
	public void setCarColor(String carColor) {
		CarColor = carColor;
	}
	
	
}
