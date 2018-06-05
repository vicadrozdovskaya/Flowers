package by.drozdovskaya.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Bouquet {
	
	List <PartOfBouquet> partsOfBouquet;
	int price;
	
		
	


	public Bouquet() {
		this.partsOfBouquet = new ArrayList<PartOfBouquet>();
	}


	public Bouquet(List<PartOfBouquet> partsOfBouquet, int price) {
		this.partsOfBouquet = partsOfBouquet;
		this.price = price;
	}


	public List<PartOfBouquet> getPartsOfBouquet() {
		return partsOfBouquet;
	}


	public void setPartsOfBouquet(List<PartOfBouquet> partsOfBouquet) {
		this.partsOfBouquet = partsOfBouquet;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Bouquet partsOfBouquet = " + partsOfBouquet + ", price = " + price + " BYN";
	}


	public int countPrice() {
		price = 0;
		for ( int i = 0; i < partsOfBouquet.size() ; i++) {
		price+= partsOfBouquet.get(i).getPrice();
		}

		return price;
	}
	
	public List <PartOfBouquet> sortByDate(){
		List <Flower> flowers = new ArrayList<Flower>();
		List <Accessories> accessories = new ArrayList<Accessories>();
		for (int i =0 ; i < partsOfBouquet.size(); i++) {
		if (partsOfBouquet.get(i) instanceof Flower) {
			flowers.add((Flower) partsOfBouquet.get(i));
		} else {
			
			accessories.add((Accessories)partsOfBouquet.get(i));
		}
		}
		partsOfBouquet.removeAll(partsOfBouquet);
		
		Flower flower = new Flower();
		boolean isSorted = false;
		  while(!isSorted) {
	            isSorted = true;
		for (int i = 0; i<flowers.size()-1; i++) {
			if (flowers.get(i).getDate().compareTo( flowers.get(i+1).getDate()) > 0) {
				isSorted = false;
			
				flower = flowers.get(i);
				flowers.set(i,flowers.get(i+1)) ;
				flowers.set(i+1,flower);
				}
			}
		
		}
		  for (int i =0 ; i < flowers.size(); i++) {
			  partsOfBouquet.add(flowers.get(i));
		  }
		  for (int i =0 ; i < accessories.size(); i++) {
			  partsOfBouquet.add(accessories.get(i));
		  }
		return this.partsOfBouquet;
	}
	
	public List<Flower> findByLongStem (int min, int max){
		
		List<Flower> flowers = new ArrayList<Flower>();
		Yard yard = new Yard();
		for (int i = 0; i<partsOfBouquet.size(); i++) {
			if (partsOfBouquet.get(i) instanceof Yard ) {
					yard = (Yard)partsOfBouquet.get(i);
					if (yard.getLongStem() >= min && yard.getLongStem() <= max) {
						flowers.add(yard);
					}
				}
			}
		
		return flowers;
		
	}
	
	

}
