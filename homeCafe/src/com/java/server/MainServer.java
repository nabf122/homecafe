package com.java.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.dbconn.DBConnection;

public class MainServer {
	
	static String sql;
	static DBConnection dbConn = new DBConnection();

	public static void main(String[] args) {
		try {
			int port = 11200;
			ServerSocket socket = new ServerSocket(port);
						
			System.out.println("Client 접속 대기중...");
			
			while(true) {
				Socket User = socket.accept();
				
				System.out.println("Client 접속 확인 됨\n IP:PORT\n "
						+ User.getLocalSocketAddress());
				
				// 클라이언트 > 서버
				InputStream input = User.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(input));
				
				// 서버 > 클라이언트
				OutputStream output = User.getOutputStream();
				PrintWriter pw = new PrintWriter(output, true);

				String str;
				String id, pwd, name, phone, email;
				
				str = br.readLine();
				if(str.equals("login")) {
					id = br.readLine();
					pwd = br.readLine();
					
					
					// 로그인 체크
					if(loginChk(id, pwd) == true) {
						pw.println("loginOK");
						pw.flush();
						pw.close();
					}else {
						pw.println("loginFail");
						pw.flush();
						pw.close();
					}
				}
				
				if(str.equals("join")){
					id = br.readLine();
					pwd = br.readLine();
					name = br.readLine();
					phone = br.readLine();
					email = br.readLine();
					
					if(duplicate_id_Chk(id) == true) {
						join(id, pwd, name, phone, email);
					}
				}
				
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean loginChk(String id, String pwd) {
		ResultSet rs;
		sql = "select id, password from user where id = ?";
		
		try(Connection conn = dbConn.getConn();
				PreparedStatement pst = conn.prepareStatement(sql)){
					pst.setString(1, id);
					rs = pst.executeQuery();
					
					rs.next();
					if(id.equals(rs.getString(1))) {
						System.out.println("로그인 아이디: "+rs.getString(1));
						if(pwd.equals(rs.getString(2))) {
							System.out.println("로그인 패스워드: "+rs.getString(2));
							return true;
						}else {
							return false;
						}
					}else {
						return false;
					}
				} catch (ClassNotFoundException e) {
			         e.printStackTrace();
				} catch (SQLException e) {
			         e.printStackTrace();
				}
		return false;
	}
	
	// 회원 가입
	public static void join(String id, String pwd, String name, String phone, String email) {
		ResultSet rs;
		sql = "insert into user (id, password, name, phone, email) values (?,?,?,?,?);";
		
		try(Connection conn = dbConn.getConn();
				PreparedStatement pst = conn.prepareStatement(sql)){
					pst.setString(1, id);
					pst.setString(2, pwd);
					pst.setString(3, name);
					pst.setString(4, phone);
					pst.setString(5, email);
					
					int r = pst.executeUpdate();
					System.out.println("변경된 row : " + r);

					System.out.println("신규 계정 "+id+" 생성");
				} catch (ClassNotFoundException e) {
			         e.printStackTrace();
				} catch (SQLException e) {
			         e.printStackTrace();
				}
	}
	
	// 중복 체크
	public static boolean duplicate_id_Chk(String id) {
		ResultSet rs;
		sql = "select count(*) from user where id = ?";
		
		try(Connection conn = dbConn.getConn();
				PreparedStatement pst = conn.prepareStatement(sql)){
					pst.setString(1, id);
					
					rs = pst.executeQuery();
					
					rs.next();
					if(rs.getInt(1) >= 1) {
						System.out.println("중복된 아이디입니다.");
						return false;
						}
					else 
						return true;
				} catch (ClassNotFoundException e) {
			         e.printStackTrace();
				} catch (SQLException e) {
			         e.printStackTrace();
				}
		return false;
	}
	
}
