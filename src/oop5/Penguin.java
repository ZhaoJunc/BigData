package oop5;

public class Penguin {
	public static final String SEX_MALE="Q×Ð";
	public static final String SEX_FEMALE="QÃÃ";
	private String name;
	private String sex;
	private int love;
	private int health;
	public Penguin() {
		super();
	}
	public Penguin(String name, String sex, int love, int health) {
		super();
		this.name = name;
		this.sex = sex;
		this.love = love;
		this.health = health;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public void show(){
		System.out.println("êÇ³Æ=" + name + ",ÐÔ±ð=" + sex + ", ½¡¿µÖµ=" + health + ", Ç×ÃÜ¶È=" + love + "");
	}
}
