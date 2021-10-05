package com.java.homecafe;

public class Barista extends Human {
	
	// 주문 번호
	private int num;
		
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	// 커피를 만든다
	public void makeCoffee(int num) {
		this.num = num;
		if(this.num == 1) {
			
		}
	}
}
