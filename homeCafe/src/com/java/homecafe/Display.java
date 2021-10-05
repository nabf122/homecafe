package com.java.homecafe;

class Display {
	
	public void menu() {
		System.out.println("주문할 메뉴를 선택해주세요.");
		System.out.println("아메리카노 4,100원(1)\n아이스 아메리카노 4,100원(2)\n"
				+ "카페라떼 4,600원(3)\n아이스 카페라떼 4,600원(4)\n"
				+ "카페모카 5,100원(5)\n아이스 카페모카 5,100원(6)\n"
				+ "주문을 종료하시려면 e를 입력해주세요.");
	}
	
	public void charge() {
		System.out.println("충전할 금액을 입력해주세요.\n");
	}
	
	public void input_name(String name) {
		System.out.println("주문하시는 분의 "+ name +"을 입력해주세요\n");
	}
	
	public void input_age(String age) {
		System.out.println("주문하시는 분의 "+ age +"를 입력해주세요\n");
	}
	
	public void pay_money(String name, int sum) {
		System.out.println("주문하시는 "+ name +"님은 총 "+ sum +" 금액을 지불해야합니다.\n");
	}
}
