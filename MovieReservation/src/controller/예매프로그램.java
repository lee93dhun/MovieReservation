package controller;

import java.util.Scanner;

import domain.CGV;
import domain.극장;
import domain.롯데시네마;
import domain.메가박스;
import domain.키오스크;





public class 예매프로그램 {
	
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		System.out.println("======== 영화 예매 프로그램 ========");
		System.out.println("영화관 선택---------------------->");
		System.out.println("1.메가박스 2.CGV 3. 롯데시네마 4.종료");
		int 선택 = 예매프로그램.scanner.nextInt();
		
		키오스크 키오스크 = null;
		키오스크 = new 극장();
		
		if( 선택 == 1 ) { 
			System.out.println("-------> 메가박스 메뉴 ");
			키오스크 = new 메가박스();
			키오스크.메뉴();
		}
		if( 선택 == 2 ) { 
			System.out.println("-------> CGV 메뉴");
			키오스크 = new CGV();
			키오스크.메뉴();
		}
		if( 선택 == 3 ) { 
			System.out.println("------> 롯데시네마 메뉴");
			키오스크 = new 롯데시네마();
			키오스크.메뉴();
		}
		if( 선택 == 4 ) { 
			System.out.println("---------- 프로그램 종료 ---------- ");
			return;
	}
			
			
			
			
			
		
	}	// main end

}	// class end
