package controller;

import java.util.Scanner;

import domain.영화회원;
import domain.키오스크;


public class 영화예매 {
	
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		
		System.out.println("==========영화예매프로그램==========");
		System.out.println("1.회원가입     2. 로그인      3.종료");
		
		키오스크 키오스크 = new 영화회원();
		int 선택 = scanner.nextInt();
		if( 선택 == 1) { 키오스크.회원가입(); }
		if( 선택 == 2) { 키오스크.로그인();}
		if( 선택 == 3) { System.out.println("------> 예매 프로그램 종료");}
			
		
	
	}

}
