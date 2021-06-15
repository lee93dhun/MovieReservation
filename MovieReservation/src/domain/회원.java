package domain;

import controller.예매프로그램;

public class 회원 implements 키오스크 {
	
	
	
	
	private String id;
	private String password;
	private String name;
		
	
		
	
	// 빈 생성자
	public 회원() { }
	// 모든 필드 생성자
	public 회원(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
	@Override
	public void 메뉴() {
	}


	@Override
	public void 로그인() {
		System.out.println("ID를 입력하세요 : ");String id	 = 예매프로그램.scanner.next();
		System.out.println("Password를 입력하세요 : "); String password	 = 예매프로그램.scanner.next();
			for( int i = 0; i<list.영화회원목록.size(); i++ ) {
				if( list.영화회원목록.get(i).equals(id) && list.영화회원목록.get(i).equals(password) ) {
					System.out.println("로그인 성공 ---------------->");
				}
				else { System.out.println("입력하신 정보가 일치하지 않습니다.");
				}
			}
		
	}

	@Override
	public void 회원가입() {
		int 스위치 =0 ;
		System.out.println("ID를 입력하세요 : ");String id	 = 예매프로그램.scanner.next();
	while( true ) {
		for(int i = 0 ; i<list.영화회원목록.size(); i++) {
									//리스트내 객체 수
			if(list.영화회원목록.get(i).equals(id)) {
							// i번째의 아이디가 현재위에입력된 아이디와 동일하면
				System.out.println("------>현재 사용중인 아이디입니다.");
				스위치 = 1 ;
				break;
			}
		}
		if(스위치 == 0) {
			System.out.println("Password를 입력하세요 : "); String password	 = 예매프로그램.scanner.next();
			System.out.println("이름을 입력하세요 : "); String name	 = 예매프로그램.scanner.next();
			
			회원 temp = new 회원(id, password, name );
			list.영화회원목록.add(temp);
			System.out.println("-------> 회원가입 성공");
			return;
		}
	}
	
		
	}
	@Override
	public void 비회원예매() {
	}

	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
	
	
	
	
 

	
	
}	// class end
