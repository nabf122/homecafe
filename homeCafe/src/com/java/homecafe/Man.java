package com.java.homecafe;

import java.util.Scanner;

public class Man extends Human {
	private int money;
	Scanner scan = new Scanner(System.in);

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
			
	// �ֹ��� �ֱ�
	public String order() {
		String order = null;

		order = scan.nextLine();
		return order;
	}
	
	// �ݾ��� �����ϱ�
	public void charge() {
		setMoney(scan.nextInt());
		System.out.println(getMoney()+"�� ���� �Ϸ�");
	}
	
	// �ݾ��� �����ϱ�
	public void pay(int sum) {
		int a = getMoney();
		setMoney(a - sum);
		System.out.println("���� ���� �ݾ��� "+ a + "������ " + sum + "�� ������ �ϰ� " + getMoney() + "�� ���ҽ��ϴ�.");
	}
}
