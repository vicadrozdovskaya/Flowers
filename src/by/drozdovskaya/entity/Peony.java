package by.drozdovskaya.entity;

import java.util.Date;

public class Peony extends Yard{
	
	private boolean isBlossomBourgeon;

	public Peony() {
		super();
	}

	public Peony(String name, String colour, int longStem, int price, Date date, String typeOfPriming, boolean isBlossomBourgeon) {
		super(name, colour, longStem, price, date, typeOfPriming);
		this.isBlossomBourgeon = isBlossomBourgeon;

	}

	public boolean isBlossomBourgeon() {
		return isBlossomBourgeon;
	}

	public void setBlossomBourgeon(boolean isBlossomBourgeon) {
		this.isBlossomBourgeon = isBlossomBourgeon;
	}

	@Override
	public String toString() {
		return "\nPeony isBlossomBourgeon = " + isBlossomBourgeon + " " + super.toString();
	}
	
	
	
	

}
