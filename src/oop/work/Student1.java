package oop.work;

public class Student1 {
	private String name;
	private int  age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age<16) {
			System.out.println("����̫С");
		}
		this.age = age;
	}
	
	public Student1() {
	
	}

	public void show() {
		System.out.println("�ҵ�������" + name + "������" + age);

}

}
