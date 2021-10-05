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

}
