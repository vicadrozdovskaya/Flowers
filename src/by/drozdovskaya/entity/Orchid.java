package by.drozdovskaya.entity;

public class Orchid extends Room {
	
	private String typeOrchid;
	private String typeBlossom;
	
	public Orchid() {
		super();

	}
	public Orchid(String name, String colour, int price, int temperature,String typeOrchid, String typeBlossom) {
		super(name, colour, price, temperature);
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
		return "Orchid typeOrchid=" + typeOrchid + ", typeBlossom=" + typeBlossom;
	}
	
	
	
	

}
