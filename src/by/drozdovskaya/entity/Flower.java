package by.drozdovskaya.entity;

import java.util.Date;

public class Flower extends PartOfBouquet {

	private String name;
	private String colour;
	private Date date;

	public Flower() {

	}

	public Flower(String name, String colour, int price, Date date) {
		super(price);
		this.name = name;
		this.colour = colour;
		this.setDate(date);
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "name = " + name + ", colour = " + colour + " " + super.toString();
	}

}
