package by.drozdovskaya.entity;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
	
	private boolean isAccessory;
	List <Accessories> accessories;
	List <Flower> flowers;
	int price;
	
		
	public Bouquet() {
		this.flowers = new ArrayList <Flower>();

	}


	public Bouquet(boolean isAccessory, List<Flower> flowers) {

		this.flowers = flowers;
		this.isAccessory = isAccessory;
		if (isAccessory == true) {
			
			this.accessories = new ArrayList <Accessories>();
		}
	}


	public boolean isAccessory() {
		return isAccessory;
	}


	public void setAccessory(boolean isAccessory) {
		this.isAccessory = isAccessory;
	}
	
	


	public List<Accessories> getAccessories() {
		return accessories;
	}


	public void setAccessories(List<Accessories> accessories) {
		this.accessories = accessories;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public List<Flower> getFlowers() {
		return flowers;
	}


	public void setFlowers(List<Flower> flowers) {
		this.flowers = flowers;
	}


	@Override
	public String toString() {
		return "Bouquet isAccessory=" + isAccessory + ", accessories=" + accessories + ", flowers=" + flowers
				+ ", price=" + price ;
	}
	
	public int countPrice() {
		price = 0;
		for ( int i = 0; i < flowers.size() ; i++) {
		price+= flowers.get(i).getPrice();
		}
		if( isAccessory == true) {
		for ( int i = 0; i < accessories.size() ; i++) {
			price+= accessories.get(i).getPrice();
			}
		}
		
		return price;
	}
	
	

}
