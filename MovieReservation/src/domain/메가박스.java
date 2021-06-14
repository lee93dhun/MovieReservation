package domain;

import java.util.Scanner;

public class 메가박스 extends 영화관 {
	Scanner sc = new Scanner(System.in);

	int 고유번호 = 01;
	int 금액;
	영화회원 회원 = new 영화회원();

	public 메가박스() {
	}

	@Override
	public void 메뉴() {
		while (true) {
			System.out.println("메가박스 메뉴");
			System.out.println("1.로그인 2.회원가입 3. 예매 4. 종료");
			int 선택 = sc.nextInt();
			if (선택 == 1) {
				로그인();
			}
			if (선택 == 2) {
				회원가입();
			}
			if (선택 == 3) {
				예매();
			}
			if (선택 == 4) {
				종료();
				break;
			}
		}

	}

	@Override
	public void 예매() {
		
			
		}

	@Override
	public void 로그인() {

	}

	@Override
	public void 회원가입() {
		System.out.println("메가박스 회원가입");
		회원.회원가입();

	}

	@Override
	public void 종료() {

		super.종료();
	}

}
