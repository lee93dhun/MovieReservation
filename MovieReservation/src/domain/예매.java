package domain;

import controller.예매프로그램;

public class 예매 extends 영화 {
	String 제목;
	String 좌석;
	int 영화번호;
	int 금액;

	public 예매() {
	}

	public 예매(String 제목, String 좌석, int 영화번호, int 금액) {
		super(제목, 좌석, 영화번호, 금액);

	}

	public void 비회원예매() {

		System.out.println("영화 선택");
		System.out.println("1.크루엘라, 2.컨저링3 3.캐시트럭");
		int 선택 = 예매프로그램.scanner.nextInt();
		if (선택 == 1) {
			영화 temp = new 영화();
			temp.크루엘라();
			System.out.println(temp.제목 + " 좌석 : ");

			System.out.println(temp.제목 + " 금액 : " + temp.금액 + "원");

		}
		if (선택 == 2) {
			영화 temp = new 영화();
			temp.컨저링3();
			System.out.println(temp.제목 + " 좌석 : ");

			System.out.println(temp.제목 + " 금액 : " + temp.금액 + "원");
		}
		if (선택 == 3) {
			영화 temp = new 영화();
			temp.캐시트럭();
			System.out.println(temp.제목 + " 좌석 : ");

			System.out.println(temp.제목 + " 금액 : " + temp.금액 + "원");

		}
		예매 temp = new 예매(제목, 좌석, 영화번호, 금액);
		list.예매목록.add(temp);

	}

	public void 회원예매() {

		System.out.println("영화 선택");
		System.out.println("1.크루엘라, 2.컨저링3 3.캐시트럭");
		int 선택 = 예매프로그램.scanner.nextInt();
		if (선택 == 1) {
			영화 temp = new 영화();
			temp.크루엘라();
			System.out.println(temp.제목 + " 좌석 : ");

			System.out.println(temp.제목 + "회원 금액 : " + (temp.금액 * 0.5) + "원");

		}
		if (선택 == 2) {
			영화 temp = new 영화();
			temp.컨저링3();
			System.out.println(temp.제목 + " 좌석 : ");

			System.out.println(temp.제목 + "회원 금액 : " + (temp.금액 * 0.5) + "원");
		}
		if (선택 == 3) {
			영화 temp = new 영화();
			temp.캐시트럭();
			System.out.println(temp.제목 + " 좌석 : ");

			System.out.println(temp.제목 + "회원 금액 : " + (temp.금액 * 0.5) + "원");
		}
		예매 temp = new 예매(제목, 좌석, 영화번호, 금액);
		list.예매목록.add(temp);

	}

	public void 예매취소() {

	}

}
