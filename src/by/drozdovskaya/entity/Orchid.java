package by.drozdovskaya.entity;

import java.util.Date;

public class Orchid extends Room {
	
	private String typeOrchid;
	private String typeBlossom;
	
	public Orchid() {
		super();

	}
	public Orchid(String name, String colour, int price, Date date, int temperature, String typeOrchid, String typeBlossom) {
		super(name, colour, price, date, temperature);
		this.typeBlossom = typeBlossom;
		this.typeOrchid = typeOrchid;

	}
	public String getTypeOrchid() {
		return typeOrchid;
	}
	public void setTypeOrchid(String typeOrchid) {
		this.typeOrchid = typeOrchid;
	}
	public String getTypeBlossom() {
		return typeBlossom;
	}
	public void setTypeBlossom(String typeBlossom) {
		this.typeBlossom = typeBlossom;
	}
	@Override
	public String toString() {
		return "\nOrchid typeOrchid = " + typeOrchid + ", typeBlossom = " + typeBlossom + " " + super.toString();
	}
	
	
	
	

}
