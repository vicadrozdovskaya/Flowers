package by.drozdovskaya.entity;

public class Peony extends Yard{
	
	private boolean isBlossomBourgeon;

	public Peony() {
		super();
	}

	public Peony(String name, String colour, int longStem, int price, String typeOfPriming, boolean isBlossomBourgeon) {
		super(name, colour, longStem, price, typeOfPriming);
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
		return "Peony isBlossomBourgeon=" + isBlossomBourgeon;
	}
	
	
	
	

}
