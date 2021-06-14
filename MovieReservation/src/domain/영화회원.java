package domain;

import controller.영화예매;

public class 영화회원 implements 키오스크 {
	
	
	
	
	private String id;
	private String password;
	private String name;
	private String email;
<<<<<<< HEAD
	private int 고유번호; 
		
	
=======
	private int 고유번호;
>>>>>>> branch 'master' of https://github.com/lee93dhun/MovieReservation
	
	
	public 영화회원() { }

<<<<<<< HEAD
	public 영화회원(String id, String password, String name, String email , int 고유번호) {
=======
	public 영화회원(String id, String password, String name, String email, int 고유번호) {
>>>>>>> branch 'master' of https://github.com/lee93dhun/MovieReservation
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.고유번호 = 고유번호;
	}
	
	
	
	@Override
	public void 메뉴() {
		
	}

	@Override
	public void 예매() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 로그인() {
		
		System.out.println("ID를 입력하세요 : ");String id	 = 영화예매.scanner.next();
		System.out.println("Password를 입력하세요 : "); String password	 = 영화예매.scanner.next();
	}

	// 회원가입 메소드
	public void 회원가입() {
		
		System.out.println("=========회원가입==========");
		int 스위치 =0 ;
		while( true ) {
			System.out.println("ID를 입력하세요 : ");String id	 = 영화예매.scanner.next();
			
			for(int i = 0 ; i<list.영화회원목록.size(); i++) {
										//리스트내 객체 수
				if(list.영화회원목록.get(i).id.equals(id)) {
								// i번째의 아이디가 현재위에입력된 아이디와 동일하면
					System.out.println("------>현재 사용중인 아이디입니다.[ 다시입력 : N 종료 ]");
					스위치 = 1 ;
					break;
				}
			}
		
<<<<<<< HEAD
		
			System.out.println("Password를 입력하세요 : "); String password	 = 영화예매.scanner.next();
			System.out.println("이름을 입력하세요 : "); String name	 = 영화예매.scanner.next();
			System.out.println("E-mail을 입력하세요 : "); String email	 = 영화예매.scanner.next();
			
			영화회원 temp = new 영화회원(id, password, name, email , 고유번호);
			list.영화회원목록.add(temp);
			System.out.println("-------> 회원가입 성공");
			return;
		}
=======
		영화회원 temp = new 영화회원(id, password, name, email,고유번호);
		영화회원목록.영화회원목록.add(temp);
>>>>>>> branch 'master' of https://github.com/lee93dhun/MovieReservation
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
 

	
	
}
