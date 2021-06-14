package domain;

public class CGV extends 영화관 {
	int 고유번호 = 02;
	int 금액;

	public CGV() {
	}

	@Override
	public void 메뉴() {
		while (true) {
			System.out.println("CGV 메뉴");
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
		
		super.예매();
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
