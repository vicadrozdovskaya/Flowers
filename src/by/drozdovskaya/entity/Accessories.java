package by.drozdovskaya.entity;

public class Accessories {
	
	private int price;
	private String name;
	private String colour;
	
	public Accessories(int price, String name, String colour) {
		this.price = price;
		this.name = name;
		this.colour = colour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
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
		return "Accessories price=" + price + ", name=" + name + ", colour=" + colour;
	}
	
	
	
	

}
