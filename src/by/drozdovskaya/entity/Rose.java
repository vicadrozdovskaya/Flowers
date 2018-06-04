package by.drozdovskaya.entity;

public class Rose extends Yard {
	
	private boolean isBelarusian;
	private boolean isLikePion;
	public Rose() {
		super();
		
	}
	public Rose(String name, String colour, int longStem, int price, String typeOfPriming, boolean isBelarusian, boolean isLikePion) {
		super(name, colour, longStem, price, typeOfPriming);
		this.isBelarusian = isBelarusian;
		this.isLikePion = isLikePion;
		
	}
	public boolean isBelarusian() {
		return isBelarusian;
	}
	public void setBelarusian(boolean isBelarusian) {
		this.isBelarusian = isBelarusian;
	}
	public boolean isLikePion() {
		return isLikePion;
	}
	public void setLikePion(boolean isLikePion) {
		this.isLikePion = isLikePion;
	}
	@Override
	public String toString() {
		return "Rose isBelarusian=" + isBelarusian + ", isLikePion=" + isLikePion;
	}
	
	
	
	

}
