package domain;

import controller.예매프로그램;

public class 메가박스 extends 극장 {

	int 고유번호 = 01;
	int 금액;
	회원 회원 = new 회원();
	
	public 메가박스() { }
	public 메가박스(String id, String password, String name) {
	}

	@Override
	public void 메뉴() {
		super.메뉴();
	}

	@Override
	public void 비회원예매() {
			
		}

	@Override
	public void 로그인() {
		System.out.println("===========메가박스 로그인===========");
//		회원.로그인();
	}

	@Override
	public void 회원가입() {
		System.out.println("==========메가박스 회원가입==========");
		int 스위치 =0 ;
		System.out.println("ID를 입력하세요 : ");String id	 = 예매프로그램.scanner.next();
	while( true ) {
		for(int i = 0 ; i<list.메가박스회원목록.size(); i++) {
									//리스트내 객체 수
			if(list.메가박스회원목록.get(i).equals(id)) {
							// i번째의 아이디가 현재위에입력된 아이디와 동일하면
				System.out.println("------>현재 사용중인 아이디입니다.");
				스위치 = 1 ;
				break;
			}
		}
		if(스위치 == 0) {
			System.out.println("Password를 입력하세요 : "); String password	 = 예매프로그램.scanner.next();
			System.out.println("이름을 입력하세요 : "); String name	 = 예매프로그램.scanner.next();
			
			메가박스 temp = new 메가박스(id, password, name );
			list.메가박스회원목록.add(temp);
			System.out.println("-------> 회원가입 성공");
			return;
		}
	}
		
	}

	@Override
	public void 종료() {

		super.종료();
	}

}
