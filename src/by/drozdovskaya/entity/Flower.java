package by.drozdovskaya.entity;

public class Flower {
	
	private String name;
	private String colour;
	private int price;
	
	public Flower() {
		
	}

	public Flower(String name, String colour, int price) {
		super();
		this.name = name;
		this.colour = colour;
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


	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Flower name=" + name + ", colour=" + colour + ", price=" + price;
	}
	
	
	
	
	
	

}
