package by.drozdovskaya.entity;

import java.util.Date;

public class Yard extends Flower {
	
	private String typeOfPriming;
	private int longStem;

	public Yard() {
		super();
		
	}

	public Yard(String name, String colour, int longStem, int price, Date date, String typeOfPriming) {
		super(name, colour, price, date);
		this.longStem = longStem;
		this.typeOfPriming = typeOfPriming;
	}

	public String getTypeOfPriming() {
		return typeOfPriming;
	}

	public void setTypeOfPriming(String typeOfPriming) {
		this.typeOfPriming = typeOfPriming;
	}
	
	

	public int getLongStem() {
		return longStem;
	}

	public void setLongStem(int longStem) {
		this.longStem = longStem;
	}

	@Override
	public String toString() {
		return "Yard typeOfPriming = " + typeOfPriming + ", longStem = " + longStem + "�� " + super.toString();
	}
	
	
	

}
