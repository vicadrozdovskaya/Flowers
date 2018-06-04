package by.drozdovskaya.run;

import java.util.ArrayList;
import java.util.List;

import by.drozdovskaya.entity.Accessories;
import by.drozdovskaya.entity.Bouquet;
import by.drozdovskaya.entity.Orchid;
import by.drozdovskaya.entity.Peony;
import by.drozdovskaya.entity.Rose;
import by.drozdovskaya.entity.Flower;

public class MainApp {

	public static void main(String[] args) {
		
		Flower rose1 = new Rose("Rose", "red", 50, 5, "weakly acidic", true, false);
		Flower rose2 = new Rose("Rose", "pink", 60, 6, "weakly acidic", true, true);
		Flower orchid1 = new Orchid("Orchid", "white", 10, 25, "Dendrobium", "Small Flower");
		Flower orchid2 = new Orchid("Orchid", "yellow", 9, 23, "Phalaenopsis", "Big Flower");
		Flower peony1 = new Peony("Peony", "pink", 60, 15, "weakly acidic", true);
		Flower peony2 = new Peony("Peony", "burgundy", 50, 16, "weakly acidic", false);
		Accessories accessorice1 = new Accessories( 2, "Ribbon", "pink");
		Accessories accessorice2 = new Accessories( 7, "Wrapping", "white");
		List <Accessories> accessories = new ArrayList<Accessories>();
		accessories.add(accessorice1);
		accessories.add(accessorice2);
		Bouquet bouquet = new Bouquet();
		List <Flower> flowers = new ArrayList<Flower>();
		flowers.add(rose1);
		flowers.add(rose1);
		flowers.add(rose1);
		flowers.add(rose1);
		flowers.add(rose1);
		flowers.add(orchid1);
		flowers.add(orchid1);
		flowers.add(orchid1);
		flowers.add(peony2);
		flowers.add(peony2);
		flowers.add(peony2);
		flowers.add(peony2);
		flowers.add(peony2);
		bouquet.setFlowers(flowers);
		bouquet.setAccessory(true);
		bouquet.setAccessories(accessories);
		bouquet.countPrice();
		System.out.println( bouquet);
		System.out.println("price bouquet = " + bouquet.countPrice());
		

	}

}
