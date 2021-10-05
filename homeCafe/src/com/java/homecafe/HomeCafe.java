package com.java.homecafe;

import java.util.ArrayList;
import java.util.Scanner;

import com.java.homecafe.coffee.Americano;
import com.java.homecafe.coffee.Cafelatte;
import com.java.homecafe.coffee.Cafemocha;
import com.java.homecafe.coffee.Coffee;

public class HomeCafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display display = new Display();
		Coffee coffee = new Coffee();
		Man man = new Man();
		Barista barista = new Barista();
						
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		
		String order1 = null;
		int m = 0;
		
		display.input_name("이름");
		man.setName(scan.nextLine());
		display.input_age("나이");
		man.setAge(scan.nextInt());
		
		// 주문 과정
		while(true) {
			display.menu();
			
			order1 = man.order();
			if(order1.equals("e")) {
				break;
			}else if(order1.charAt(0) == '1' || order1.charAt(0) == '2' || 
					order1.charAt(0) == '3' || order1.charAt(0) == '4' || order1.charAt(0) == '5' || order1.charAt(0) == '6') {
				list.add(order1);	
			}else {
				System.out.println("올바른 주문 번호를 입력해주세요\n");
			}
				
		}
		
		// 금액 충전하기
		display.charge();
		man.charge();
		
		/*
		coffee = new Americano("따뜻한");
		System.out.println(coffee.getCoffee_name()+" "
				+coffee.getIceorwarm()+" "+coffee.getPrice()
				+" "+
				barista.chk(list.get(0))
				);
				*/
		
		// 주문한 금액 합산하기
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
            	if(list.get(i).charAt(0) == '1') {
            		coffee = new Americano("따뜻한");
            	} else if(list.get(i).charAt(0) == '2') {
            		coffee = new Americano("아이스");
            	} else if(list.get(i).charAt(0) == '3') {
            		coffee = new Cafelatte("따뜻한");
            	} else if(list.get(i).charAt(0) == '4') {
            		coffee = new Cafelatte("아이스");
            	} else if(list.get(i).charAt(0) == '5') {
            		coffee = new Cafemocha("따뜻한");
            	} else if(list.get(i).charAt(0) == '6') {
            		coffee = new Cafemocha("아이스");
            	} else {
            	}
            	sum = sum + coffee.getPrice();
        }
		
		display.pay_money(man.getName(), sum);
		man.pay(sum);
        
		System.out.println();
        
        // 커피를 만든다
        for (int j = 0; j < list.size(); j++) {
            	if(list.get(j).charAt(0) == '1') {
            		coffee = new Americano("따뜻한");
            	} else if(list.get(j).charAt(0) == '2') {
            		coffee = new Americano("아이스");
            	} else if(list.get(j).charAt(0) == '3') {
            		coffee = new Cafelatte("따뜻한");
            	} else if(list.get(j).charAt(0) == '4') {
            		coffee = new Cafelatte("아이스");
            	} else if(list.get(j).charAt(0) == '5') {
            		coffee = new Cafemocha("따뜻한");
            	} else if(list.get(j).charAt(0) == '6') {
            		coffee = new Cafemocha("아이스");
            	}
            	
            	String messege = barista.makeCoffee(coffee.getCoffee_name(), coffee.getIceorwarm());
            	System.out.println(man.getName()+"님이 "+messege);
        }
	}
}
