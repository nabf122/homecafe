package com.java.homecafe;

import java.util.Scanner;

public class HomeCafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Menu menu = new Menu();
		Coffee coffee = new Coffee();
		Human man = new Man();
		Human barista = new Barista();
						
		Scanner scan = new Scanner(System.in);
		String order;
		
		System.out.println("�̸��� ���̸� �Է����ּ���");
		
		
		while(true) {
			menu.ShowMenuList();			
		}

	}

}
