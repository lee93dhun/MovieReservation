package domain;

public interface 키오스크 {

	public void 메뉴();

	public void 비회원예매();

	public void 로그인();

	public void 회원가입();

	public default void 종료() {

		System.out.println("예매 종료");
	}

}
