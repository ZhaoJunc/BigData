package oop2;

public class TestPenguin {

	public static void main(String[] args) {
		Penguin p=new Penguin();
		p.name="∂º∂¡";
		p.health ="100";
		p.love=100;
		p.sex=Penguin.man;
		p.age=3;
		p.show();
		Penguin p1=new Penguin("π∑µ∞","90",80,"Q√√",3);
		p1.show();
		
	}
}
