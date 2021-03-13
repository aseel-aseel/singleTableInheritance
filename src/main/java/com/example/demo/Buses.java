package com.example.demo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity

@DiscriminatorValue(value="Buses")
public class Buses extends Vehicles {

	private int NumOfWheels;
	private int NumOfSeats;
	
	
	public Buses() {}
	
	
	public Buses(int numOfWheels, int numOfSeats) {
		super();
		NumOfWheels = numOfWheels;
		NumOfSeats = numOfSeats;
	}
	public int getNumOfWheels() {
		return NumOfWheels;
	}
	public void setNumOfWheels(int numOfWheels) {
		NumOfWheels = numOfWheels;
	}
	public int getNumOfSeats() {
		return NumOfSeats;
	}
	public void setNumOfSeats(int numOfSeats) {
		NumOfSeats = numOfSeats;
	}
	
	
}
