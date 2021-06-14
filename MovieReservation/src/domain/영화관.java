package domain;

import java.util.Scanner;

public static

public class 영화관 implements 키오스크 {
	
	int 금액;
	String 아이디;
	String 비밀번호;
	String 이름;

	@Override
	public void 메뉴() {
		System.out.println("영화관 선택");
		System.out.println("1.메가박스 2.CGV 3.롯데시네마");
		int 선택 = sc.nextInt();
		if (선택 == 1) {
			메가박스 메가박스 = new 메가박스();
			메가박스.메뉴();
		}
		if (선택 == 2) {
			CGV cgv = new CGV();
			cgv.메뉴();

		}
		if (선택 == 3) {
			롯데시네마 롯데시네마 = new 롯데시네마();
			롯데시네마.메뉴();

		}

	}

	@Override
	public void 예매() {
		System.out.println("예매 진행");

	}

	@Override
	public void 로그인() {
		System.out.println("로그인 진행");

	}

	@Override
	public void 회원가입() {
		System.out.println("회원가입 진행");

	}

	@Override
	public void 종료() {

		키오스크.super.종료();
	}

}
