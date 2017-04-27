package oop5;

public class Dog1 extends Pet{

	private String strain;

	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}
	public void print() {
	System.out.println("昵称"+super.getName()+"，健康值"+super.getHealth()+"，亲密度"+super.getLove());
	System.out.println("品种"+this.strain);	
	}

}
