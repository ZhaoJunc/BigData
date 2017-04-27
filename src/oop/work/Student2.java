package oop.work;

public class Student2 {

	private String name;
	private int age;
	private String sex;
	private String specialty;
	public Student2(String name, int age, String sex, String specialty) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.specialty = specialty;
	}

	public void show() {
		System.out.println("我的名字是："+ name +"，年龄："+ age + "，专业："+ specialty);
	}
	
}
