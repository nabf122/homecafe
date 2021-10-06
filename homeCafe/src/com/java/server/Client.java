package com.java.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("59.5.20.46", 11200);
			System.out.println("서버 접속 완료");
			
			// 클라이언트 > 서버
			OutputStream output = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(output, true);
			
			// 서버 > 클라이언트
			InputStream input = socket.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(input));
			
			Scanner scan = new Scanner(System.in);
			String str;
			String id, pwd, name, phone, email;
			
			while(true) {
				// 로그인 하기
				System.out.println("HomeCafe에 어서오세요.\n로그인을 하시겠어요? 그렇다면 1을 눌러주세요."
						+ "\n아이디가 없으시다구요? 그렇다면 2를 눌러 회원가입을 해주세요.");
				str = scan.nextLine();
				// 로그인
				if(str.equals("1")) {
					pw.println("login");
				
					System.out.print("ID : ");
					id = scan.nextLine();
					System.out.print("PW : ");
					pwd = scan.nextLine();
					
					pw.println(id);
					pw.flush();
					
					pw.println(pwd);
					pw.flush();
				
					System.out.println("로그인 시도 중입니다...");
				
					if(br.readLine().equals("loginOK"))
					{
						System.out.println(id+"님 로그인 성공했습니다.");
						break;
					} else {
						System.out.println("아이디 또는 패스워드가 틀립니다.");
					}
				// 회원 가입
				}
				if(str.equals("2")) {
					pw.println("join");
				
					System.out.print("NEW ID : ");
					id = scan.nextLine();
					System.out.print("NEW PW : ");
					pwd = scan.nextLine();
					System.out.print("RE-NEW PW : ");
					if(pwd.equals(scan.nextLine())) {
						System.out.print("NAME : ");
						name = scan.nextLine();
						System.out.print("PHONE NUMBER : ");
						phone = scan.nextLine();
						System.out.print("EMAIL : ");
						email = scan.nextLine();
					
						pw.println(id);
						pw.flush();
					
						pw.println(pwd);
						pw.flush();
					
						pw.println(name);
						pw.flush();
					
						pw.println(phone);
						pw.flush();
					
						pw.println(email);
						pw.flush();
					
						System.out.println("계정 생성 시도 중입니다...");
						System.out.println("계정 생성 완료되었습니다.");
					} else {
							System.out.println("패스워드 불일치");
					}				
				}
			}
			socket.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
