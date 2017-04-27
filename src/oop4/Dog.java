package oop4;

public class Dog {
	private String name;
	private String strain;
	private int health;
	private int age;
	private int love;
	public Dog() {
	}
	public Dog(String name, String strain, int health, int age, int love) {
		super();
		this.name = name;
		this.strain = strain;
		this.health = health;
		this.age = age;
		this.love = love;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	

}
