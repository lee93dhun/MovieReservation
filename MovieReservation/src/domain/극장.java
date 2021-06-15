package domain;

import controller.예매프로그램;

public class 극장 implements 키오스크 {

	// 필드
	String 아이디;
	String 비밀번호;
	String 이름;
	int 금액;

	// 빈 생성자
	public 극장() {
	}
	// 모든 필드 생성자

	public 극장(String 아이디, String 비밀번호, String 이름, int 금액) {
		super();
		this.아이디 = 아이디;
		this.비밀번호 = 비밀번호;
		this.이름 = 이름;
		this.금액 = 금액;
	}

	@Override
	public void 메뉴() {

		while (true) {

			System.out.println("1.로그인 2.회원가입  3.비회원예매 4.종료");
			int 선택 = 예매프로그램.scanner.nextInt();
			if (선택 == 1) {
				로그인();
			}
			if (선택 == 2) {
				회원가입();
			}

			if (선택 == 3) {
				비회원예매();
			}
			if (선택 == 4) {
				return;
			}
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

	@Override
	public void 예매() {
		System.out.println("영화 선택");
		System.out.println("1.영화1, 2.영화2 3.영화3");
		int 선택 = 예매프로그램.scanner.nextInt();
		if(선택 == 1) {}
		if(선택 == 2) {}
		if(선택 == 3) {}
		
		
	}

}
