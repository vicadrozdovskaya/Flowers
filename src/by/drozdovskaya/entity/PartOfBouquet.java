package by.drozdovskaya.entity;

public class PartOfBouquet {

	private int price;

	public PartOfBouquet() {

	}

	public PartOfBouquet(int price) {
		
		this.price = price;

	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PartOfBouquet price = " + price + " BYN ";
	}
	
	

}
