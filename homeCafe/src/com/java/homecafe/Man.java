package com.java.homecafe;

import java.util.Scanner;

class Man extends Human {
	private int money;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	// 이름과 나이 저장하기
	public void name(String name) {
		
	}
	
	// 주문하기
	public String order() {
		String order = null;
		Scanner scan = new Scanner(System.in);
		
		order = scan.nextLine();
		
		return order;
	}
	
}
