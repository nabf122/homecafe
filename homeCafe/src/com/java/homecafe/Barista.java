package com.java.homecafe;

public class Barista extends Human {
	
	// �ֹ� ��ȣ
	private int num;
		
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	// �ֹ� üũ
	public boolean chk(String a) {
		if(a.charAt(0)=='1' || a.charAt(0)=='2' || a.charAt(0)=='3' || a.charAt(0)=='4' || a.charAt(0)=='5' || a.charAt(0)=='6') {
			return true;
		} else
			return false;
	}
	
	// Ŀ�Ǹ� �����
	public String makeCoffee(String a, String b) {
		return "�ֹ��Ͻ� "+b+" "+a+" ���Խ��ϴ�.";
	}
}
