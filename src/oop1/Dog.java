package oop1;

public class Dog {
	String name ;//名字
	int health;//健康值
	int love ;//亲密度
	String strain;//品种
	int age ;
	public void run(){
		System.out.println("狗狗奔向。。。");
		
	}
	public void shout(){
		System.out.println("旺旺");
	}
	public void show(){
		System.out.println("名字"+name+"健康值"+health+"宠爱度"+love+"品种"+strain+"年龄"+age);
	}

}
