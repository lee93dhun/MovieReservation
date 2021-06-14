package main;



public interface 키오스크 {
	

	public void 메뉴();

	public void 예매();
	
	public void 로그인();
	
	public void 회원가입();
	
	public default void 종료() {
		System.out.println("예메 종료");
	}
	
}
