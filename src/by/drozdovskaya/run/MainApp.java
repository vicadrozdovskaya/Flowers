package by.drozdovskaya.run;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import by.drozdovskaya.entity.Accessories;
import by.drozdovskaya.entity.Bouquet;
import by.drozdovskaya.entity.Orchid;
import by.drozdovskaya.entity.PartOfBouquet;
import by.drozdovskaya.entity.Peony;
import by.drozdovskaya.entity.Rose;
import by.drozdovskaya.entity.Flower;

public class MainApp {

	public static void main(String[] args) throws ParseException {
		
		//—оздать консольное приложение, удовлетвор€ющее следующим требовани€м:
//		Х »спользовать возможности ќќѕ: классы, наследование, полиморфизм, ин-
//		капсул€ци€.
//		Х  аждый класс должен иметь отражающее смысл название и информатив-
//		ный состав.
//		Х Ќаследование должно примен€тьс€ только тогда, когда это имеет смысл.
//		Х ѕри кодировании должны быть использованы соглашени€ об оформлении
//		кода java code convention.
//		Х  лассы должны быть грамотно разложены по пакетам.
//		Х  онсольное меню должно быть минимальным.
//		Х ƒл€ хранени€ параметров инициализации можно использовать файлы.
//		1. ÷веточница. ќпределить иерархию цветов. —оздать несколько объек-
//		тов-цветов. —обрать букет (использу€ аксессуары) с определением его
//		стоимости. ѕровести сортировку цветов в букете на основе уровн€ све-
//		жести. Ќайти цветок в букете, соответствующий заданному диапазону
//		длин стеблей.
		
		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		
		Flower rose1 = new Rose("Rose", "red", 40, 5, format.parse("06.06.2018"), "weakly acidic", true, false);
		Flower rose2 = new Rose("Rose", "pink", 60, 6, format.parse("06.06.2018"), "weakly acidic", true, true);
		Flower orchid1 = new Orchid("Orchid", "white", 10, format.parse("05.06.2018"), 25, "Dendrobium", "Small Flower");
		Flower orchid2 = new Orchid("Orchid", "yellow", 9, format.parse("05.06.2018"), 23,  "Phalaenopsis", "Big Flower");
		Flower peony1 = new Peony("Peony", "pink", 60, 15, format.parse("05.06.2018"), "weakly acidic", true);
		Flower peony2 = new Peony("Peony", "burgundy", 50, 16, format.parse("05.06.2018"), "weakly acidic", false);
		Accessories accessorice1 = new Accessories( 2, "Ribbon", "pink");
		Accessories accessorice2 = new Accessories( 7, "Wrapping", "white");
		Accessories accessorice3 = new Accessories( 3, "Ribbon", "violet");
		Accessories accessorice4 = new Accessories( 10, "Wrapping", "yellow");
		List <PartOfBouquet> partsOfBouquet = new ArrayList<PartOfBouquet>();
		partsOfBouquet.add(accessorice1);
		partsOfBouquet.add(accessorice2);
		Bouquet bouquet = new Bouquet();
		partsOfBouquet.add(rose1);
		partsOfBouquet.add(rose1);
		partsOfBouquet.add(rose1);
		partsOfBouquet.add(rose1);
		partsOfBouquet.add(rose1);
		partsOfBouquet.add(orchid1);
		partsOfBouquet.add(orchid1);
		partsOfBouquet.add(orchid1);
		partsOfBouquet.add(peony2);
		partsOfBouquet.add(peony2);
		partsOfBouquet.add(peony2);
		partsOfBouquet.add(peony2);
		partsOfBouquet.add(peony2);
		bouquet.setPartsOfBouquet(partsOfBouquet);
		bouquet.countPrice();
		System.out.println( bouquet);
		System.out.println("price bouquet = " + bouquet.countPrice());
		bouquet.sortByDate();
		System.out.println( bouquet);
		System.out.println(bouquet.findByLongStem(40, 50));
		Bouquet bouquet2 = new Bouquet();
		List <PartOfBouquet> partsOfBouquet2 = new ArrayList<PartOfBouquet>();
		partsOfBouquet2.add(accessorice3);
		partsOfBouquet2.add(accessorice4);
		partsOfBouquet2.add(rose2);
		partsOfBouquet2.add(rose2);
		partsOfBouquet2.add(rose2);
		partsOfBouquet2.add(peony1);
		partsOfBouquet2.add(peony1);
		partsOfBouquet2.add(peony1);
		partsOfBouquet2.add(orchid2);
		partsOfBouquet2.add(orchid2);
		partsOfBouquet2.add(orchid2);
		bouquet2.setPartsOfBouquet(partsOfBouquet2);

		System.out.println(bouquet2.countPrice());
		System.out.println(bouquet2.sortByDate());
		System.out.println(bouquet2.findByLongStem(50, 60));

	}

}
