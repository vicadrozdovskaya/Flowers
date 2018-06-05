package by.drozdovskaya.entity;

public class Accessories extends PartOfBouquet {
	
	private String name;
	private String colour;
	
	public Accessories(int price, String name, String colour) {
		super(price);
		this.name = name;
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "\nAccessories  name = " + name + ", colour = " + colour + " " + super.toString();
	}
	
	
	
	

}
