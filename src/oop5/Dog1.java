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
	System.out.println("�ǳ�"+super.getName()+"������ֵ"+super.getHealth()+"�����ܶ�"+super.getLove());
	System.out.println("Ʒ��"+this.strain);	
	}

}
