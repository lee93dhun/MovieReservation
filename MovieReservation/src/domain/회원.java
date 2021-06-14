package domain;


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
		
//		System.out.println("ID를 입력하세요 : ");String id	 = 예매프로그램.scanner.next();
//		System.out.println("Password를 입력하세요 : "); String password	 = 예매프로그램.scanner.next();
//			for( int i = 0; i<list.영화회원목록.size(); i++ ) {
//				if( list.영화회원목록.get(i).id.equals(id) && list.영화회원목록.get(i).equals(password) ) {
//					System.out.println("로그인 성공 ---------------->");
//				}
//				else { System.out.println("입력하신 정보가 일치하지 않습니다.");
//				}
//			}
		
	}

	@Override
	public void 회원가입() {
		
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
