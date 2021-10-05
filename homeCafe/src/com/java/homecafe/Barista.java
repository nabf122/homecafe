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

	// 주문 체크
	public boolean chk(String a) {
		if(a.charAt(0)=='1' || a.charAt(0)=='2' || a.charAt(0)=='3' || a.charAt(0)=='4' || a.charAt(0)=='5' || a.charAt(0)=='6') {
			return true;
		} else
			return false;
	}
	
	// 커피를 만든다
	public String makeCoffee(String a, String b) {
		return "주문하신 "+b+" "+a+" 나왔습니다.";
	}
}
