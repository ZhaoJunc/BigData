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
			System.out.println("年龄太小");
		}
		this.age = age;
	}
	
	public Student1() {
	
	}

	public void show() {
		System.out.println("我的姓名：" + name + "，年龄" + age);

}

}
