package domain;

import java.util.Scanner;

public class 회원 {


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("==========영화예매프로그램==========");
		System.out.println("1.회원가입     2. 로그인      3.종료");
		
		int 선택 = scanner.nextInt();
		if( 선택 == 1) { }
		if( 선택 == 2) { }
		if( 선택 == 3) { System.out.println("------> 예매 프로그램 종료");}
			
			
	
	}
	
}
