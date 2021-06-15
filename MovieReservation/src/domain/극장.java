package domain;

import controller.예매프로그램;

public class 극장 extends 회원 implements 키오스크 {
	
	// 필드
	String 아이디;
	String 비밀번호;
	String 이름;
	
	// 빈 생성자
	public 극장() {}
	// 모든 필드 생성자

	public 극장(String 아이디, String 비밀번호, String 이름) {
		super();
		this.아이디 = 아이디;
		this.비밀번호 = 비밀번호;
		this.이름 = 이름;
	}

	@Override
	public void 메뉴() {
		while (true) {
			System.out.println("1.로그인 2.회원가입 3.예매 4.종료");
			int 선택 = 예매프로그램.scanner.nextInt();
			if (선택 == 1) 로그인();
			if (선택 == 2) 회원가입();
			if (선택 == 3) 비회원예매();
			if (선택 == 4) return;
		}
	}  
	@Override
	public void 로그인() {
		
	}
	@Override
	public void 회원가입() {
		
	}
	@Override
	public void 비회원예매() {
		
	}
	

}
