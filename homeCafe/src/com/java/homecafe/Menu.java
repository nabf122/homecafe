package com.java.homecafe;

class Menu {
	/*  coffee_name, 커피 이름
	ice or warm, 아이스 따뜻한
	price		 가격
	 */
	private String coffee_name;
	private String iceorwarm;
	private int price;

	public String getCoffee_name() {
		return coffee_name;
	}
	public void setCoffee_name(String coffee_name) {
		this.coffee_name = coffee_name;
	}
	public String getIceorwarm() {
		return iceorwarm;
	}
	public void setIceorwarm(String iceorwarm) {
		this.iceorwarm = iceorwarm;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 메뉴 리스트 보여주기
	public void ShowMenuList() {
		System.out.println("주문할 메뉴를 선택해주세요");
		System.out.println("아메리카노 4,100원(1)\n아이스 아메리카노 4,100원(2)\n"
				+ "카페라떼 4,600원(3)\n아이스 카페라떼 4,600원(4)\n"
				+ "카페모카 5,100원(5)\n아이스 카페모카 5,100원(6)\n");
	}
}
