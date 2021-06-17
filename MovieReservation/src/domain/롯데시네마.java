package domain;




public class 롯데시네마 extends 극장 {
	String id,password,name;
	int 고유번호 = 03;
	int 금액;
	회원 회원 = new 회원();
	public 롯데시네마() {}
	
	public 롯데시네마(String id, String password, String name,int 금액, int 고유번호) {
		super(id,password,name,금액);
		this.고유번호 = 고유번호;
	}
	
	@Override
	public void 메뉴() {

		System.out.println("롯데시네마 메뉴");
		super.메뉴();

	}

	@Override
	public void 비회원예매() {
		super.비회원예매();
	}

	@Override
	public void 로그인() {
		System.out.println("===========롯데시네마 로그인===========");
		회원.로그인();
	}

	@Override
	public void 회원가입() {
		System.out.println("==========롯데시네마 회원가입==========");
		회원.회원가입();
	}

	@Override
	public void 종료() {
		super.종료();
	}
}
