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
		
		display.input_name("");
		man.setName(scan.nextLine());
		display.input_age("");
		man.setAge(scan.nextInt());
		
		// �ֹ� ����
		while(true) {
			display.menu();
			
			order1 = man.order();
			if(order1.equals("e")) {
				break;
			}else if(order1.charAt(0) == '1' || order1.charAt(0) == '2' || 
					order1.charAt(0) == '3' || order1.charAt(0) == '4' || order1.charAt(0) == '5' || order1.charAt(0) == '6') {
				list.add(order1);	
			}else {
				System.out.println("");
			}
				
		}
		
		//
		display.charge();
		man.charge();
		
		
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
            	if(list.get(i).charAt(0) == '1') {
            		coffee = new Americano("������");
            	} else if(list.get(i).charAt(0) == '2') {
            		coffee = new Americano("���̽�");
            	} else if(list.get(i).charAt(0) == '3') {
            		coffee = new Cafelatte("������");
            	} else if(list.get(i).charAt(0) == '4') {
            		coffee = new Cafelatte("���̽�");
            	} else if(list.get(i).charAt(0) == '5') {
            		coffee = new Cafemocha("������");
            	} else if(list.get(i).charAt(0) == '6') {
            		coffee = new Cafemocha("���̽�");
            	} else {
            	}
            	sum = sum + coffee.getPrice();
        }
		
		display.pay_money(man.getName(), sum);
		man.pay(sum);
        
		System.out.println();
        
        // Ŀ�Ǹ� �����
        for (int j = 0; j < list.size(); j++) {
            	if(list.get(j).charAt(0) == '1') {
            		coffee = new Americano("������");
            	} else if(list.get(j).charAt(0) == '2') {
            		coffee = new Americano("���̽�");
            	} else if(list.get(j).charAt(0) == '3') {
            		coffee = new Cafelatte("������");
            	} else if(list.get(j).charAt(0) == '4') {
            		coffee = new Cafelatte("���̽�");
            	} else if(list.get(j).charAt(0) == '5') {
            		coffee = new Cafemocha("������");
            	} else if(list.get(j).charAt(0) == '6') {
            		coffee = new Cafemocha("���̽�");
            	}
            	
            	String messege = barista.makeCoffee(coffee.getCoffee_name(), coffee.getIceorwarm());
            	System.out.println(man.getName()+"���� "+messege);
        }
	}
}
