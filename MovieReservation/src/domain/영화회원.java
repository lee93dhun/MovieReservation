package domain;

import controller.영화예매;

public class 영화회원 {
	
	
	private String id;
	private String password;
	private String name;
	private String email;
	
	
	public 영화회원() { }

	public 영화회원(String id, String password, String name, String email) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
	}
	
	// 회원가입 메소드
	public void 회원가입() {
		
		System.out.println("=========회원가입==========");
		System.out.println("ID를 입력하세요 : "); String id	 = 영화예매.scanner.next();
		System.out.println("Password를 입력하세요 : "); String password	 = 영화예매.scanner.next();
		System.out.println("이름을 입력하세요 : "); String name	 = 영화예매.scanner.next();
		System.out.println("E-mail을 입력하세요 : "); String email	 = 영화예매.scanner.next();
		
		영화회원 temp = new 영화회원(id, password, name, email);
		영화회원목록.영화회원목록.add(temp)
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
