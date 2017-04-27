package oop5;

public class Dog {
	private String name;
	private String strain;
	private int health;
	private int love ;
	public Dog() {
		
	}
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getStrain() {
		return strain;
	}



	public void setStrain(String strain) {
		this.strain = strain;
	}



	public int getHealth() {
		return health;
	}



	public void setHealth(int health) {
		this.health = health;
	}



	public int getLove() {
		return love;
	}



	public void setLove(int love) {
		this.love = love;
	}



	public Dog(String name, String strain, int health, int love) {
		
		this.name = name;
		this.strain = strain;
		this.health = health;
		this.love = love;
	}


	public void show() {
		System.out.println("昵称="+ name +"，品种=" + strain+ "，健康值=" + health +"，亲密度="+ love );
			
	}
	
	
}
