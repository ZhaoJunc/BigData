package oop5;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�������ǳ�");
		String name=input.next();
		System.out.println("��ѡ����Ҫ�����ĳ������ͣ�1.���� 2.���");
		int num=input.nextInt();
		switch (num) {
		case 1:
			Dog d=new Dog();
			d.setName(name);
			System.out.println("�����빷��Ʒ�֣�");
			String strain=input.next();
			d.setStrain(strain);
			d.show();
			break;

		case 2:
			Penguin p=new Penguin();
			p.setName(name);
			System.out.println("�����������Ա�1��"+Penguin.SEX_FEMALE+"2:"+Penguin.SEX_MALE);
			int num1=input.nextInt();
			switch (num1) {
			case 1:
				p.setSex(Penguin.SEX_FEMALE);	
				break;
			case 2:
				p.setSex(Penguin.SEX_MALE);
				break;
			}
			p.show();
			break;
		}
		
	}
}
