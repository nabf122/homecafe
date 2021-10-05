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
			
	// 주문을 넣기
	public String order() {
		String order = null;

		order = scan.nextLine();
		return order;
	}
	
	// 금액을 충전하기
	public void charge() {
		setMoney(scan.nextInt());
		System.out.println(getMoney()+"원 충전 완료");
	}
	
	// 금액을 지불하기
	public void pay(int sum) {
		int a = getMoney();
		setMoney(a - sum);
		System.out.println("현재 남은 금액은 "+ a + "원에서 " + sum + "원 지불을 하고 " + getMoney() + "원 남았습니다.");
	}
}
