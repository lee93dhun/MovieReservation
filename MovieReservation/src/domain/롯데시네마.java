package domain;

import java.util.Scanner;

import controller.예매프로그램;

public class 롯데시네마 extends 극장 {
	int 고유번호 = 03;
	int 금액;

	@Override
	public void 메뉴() {
		while (true) {
			System.out.println("롯데시네마 메뉴");
			super.메뉴();
		}
	}

	@Override
	public void 비회원예매() {
		super.비회원예매();
	}

	@Override
	public void 로그인() {

		super.로그인();
	}

	@Override
	public void 회원가입() {

		super.회원가입();
	}

	@Override
	public void 종료() {
		super.종료();
	}
}
