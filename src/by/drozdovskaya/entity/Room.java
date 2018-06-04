package by.drozdovskaya.entity;

public class Room extends Flower{

	private int temperature;

	public Room() {
		super();
		
	}

	public Room(String name, String colour, int price, int temperature) {
		super(name, colour, price);
		this.temperature = temperature;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "Room temperature=" + temperature ;
	}

	
	
	
}
