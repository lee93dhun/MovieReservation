package domain;

public class CGV extends 극장 {
	String id, password, name;
	int 고유번호 = 02;
	int 금액;
	회원 회원 = new 회원();

	public CGV() {
	}

	public CGV(String id, String password, String name, int 금액, int 고유번호) {
		super(id, password, name, 금액);
		this.고유번호 = 고유번호;

	}

	@Override
	public void 메뉴() {

		System.out.println("CGV 메뉴");
		super.메뉴();

	}

	@Override
	public void 비회원예매() {
		super.비회원예매();
	}

	@Override
	public void 로그인() {
		System.out.println("===========CGV 로그인===========");
		회원.로그인();
	}

	@Override
	public void 회원가입() {
		System.out.println("==========CGV 회원가입==========");
		회원.회원가입();
	}

	@Override
	public void 종료() {
		super.종료();
	}
}
