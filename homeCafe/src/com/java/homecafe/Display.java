package com.java.homecafe;

class Display {
	
	public void menu() {
		System.out.println("�ֹ��� �޴��� �������ּ���.");
		System.out.println("�Ƹ޸�ī�� 4,100��(1)\n���̽� �Ƹ޸�ī�� 4,100��(2)\n"
				+ "ī��� 4,600��(3)\n���̽� ī��� 4,600��(4)\n"
				+ "ī���ī 5,100��(5)\n���̽� ī���ī 5,100��(6)\n"
				+ "�ֹ��� �����Ͻ÷��� e�� �Է����ּ���.");
	}
	
	public void charge() {
		System.out.println("������ �ݾ��� �Է����ּ���.\n");
	}
	
	public void input_name(String name) {
		System.out.println("�ֹ��Ͻô� ���� "+ name +"�� �Է����ּ���\n");
	}
	
	public void input_age(String age) {
		System.out.println("�ֹ��Ͻô� ���� "+ age +"�� �Է����ּ���\n");
	}
	
	public void pay_money(String name, int sum) {
		System.out.println("�ֹ��Ͻô� "+ name +"���� �� "+ sum +" �ݾ��� �����ؾ��մϴ�.\n");
	}
}
