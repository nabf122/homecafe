package com.java.homecafe;

class Menu {
	/*  coffee_name, Ŀ�� �̸�
	ice or warm, ���̽� ������
	price		 ����
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
	
	// �޴� ����Ʈ �����ֱ�
	public void ShowMenuList() {
		System.out.println("�ֹ��� �޴��� �������ּ���");
		System.out.println("�Ƹ޸�ī�� 4,100��(1)\n���̽� �Ƹ޸�ī�� 4,100��(2)\n"
				+ "ī��� 4,600��(3)\n���̽� ī��� 4,600��(4)\n"
				+ "ī���ī 5,100��(5)\n���̽� ī���ī 5,100��(6)\n");
	}
}
