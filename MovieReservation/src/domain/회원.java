package domain;

<<<<<<< HEAD
import controller.예매프로그램;
=======
import controller.�삁留ㅽ봽濡쒓렇�옩;
>>>>>>> refs/remotes/origin/master

public class �쉶�썝 implements �궎�삤�뒪�겕 {
	
	
	
	
	private String id;
	private String password;
	private String name;
		
	
		
	
	// 鍮� �깮�꽦�옄
	public �쉶�썝() { }
	// 紐⑤뱺 �븘�뱶 �깮�꽦�옄
	public �쉶�썝(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
	@Override
	public void 硫붾돱() {
	}


	@Override
<<<<<<< HEAD
	public void 로그인() {
		System.out.println("ID를 입력하세요 : ");String id	 = 예매프로그램.scanner.next();
		System.out.println("Password를 입력하세요 : "); String password	 = 예매프로그램.scanner.next();
			for( int i = 0; i<list.영화회원목록.size(); i++ ) {
				if( list.영화회원목록.get(i).id.equals(id) && list.영화회원목록.get(i).password.equals(password) ) {
					System.out.println("로그인 성공 ---------------->");
				}
				else { System.out.println("입력하신 정보가 일치하지 않습니다.");
=======
	public void 濡쒓렇�씤() {
		System.out.println("ID瑜� �엯�젰�븯�꽭�슂 : ");String id	 = �삁留ㅽ봽濡쒓렇�옩.scanner.next();
		System.out.println("Password瑜� �엯�젰�븯�꽭�슂 : "); String password	 = �삁留ㅽ봽濡쒓렇�옩.scanner.next();
			for( int i = 0; i<list.�쁺�솕�쉶�썝紐⑸줉.size(); i++ ) {
				if( list.�쁺�솕�쉶�썝紐⑸줉.get(i).equals(id) && list.�쁺�솕�쉶�썝紐⑸줉.get(i).equals(password) ) {
					System.out.println("濡쒓렇�씤 �꽦怨� ---------------->");
				}
				else { System.out.println("�엯�젰�븯�떊 �젙蹂닿�� �씪移섑븯吏� �븡�뒿�땲�떎.");
>>>>>>> refs/remotes/origin/master
				}
			}
		
	}

	@Override
	public void �쉶�썝媛��엯() {
		int �뒪�쐞移� =0 ;
		System.out.println("ID瑜� �엯�젰�븯�꽭�슂 : ");String id	 = �삁留ㅽ봽濡쒓렇�옩.scanner.next();
	while( true ) {
		for(int i = 0 ; i<list.�쁺�솕�쉶�썝紐⑸줉.size(); i++) {
									//由ъ뒪�듃�궡 媛앹껜 �닔
			if(list.�쁺�솕�쉶�썝紐⑸줉.get(i).equals(id)) {
							// i踰덉㎏�쓽 �븘�씠�뵒媛� �쁽�옱�쐞�뿉�엯�젰�맂 �븘�씠�뵒��� �룞�씪�븯硫�
				System.out.println("------>�쁽�옱 �궗�슜以묒씤 �븘�씠�뵒�엯�땲�떎.");
				�뒪�쐞移� = 1 ;
				break;
			}
		}
		if(�뒪�쐞移� == 0) {
			System.out.println("Password瑜� �엯�젰�븯�꽭�슂 : "); String password	 = �삁留ㅽ봽濡쒓렇�옩.scanner.next();
			System.out.println("�씠由꾩쓣 �엯�젰�븯�꽭�슂 : "); String name	 = �삁留ㅽ봽濡쒓렇�옩.scanner.next();
			
			�쉶�썝 temp = new �쉶�썝(id, password, name );
			list.�쁺�솕�쉶�썝紐⑸줉.add(temp);
			System.out.println("-------> �쉶�썝媛��엯 �꽦怨�");
			return;
		}
	}
	
		
		
	while( true ) {
		int 스위치 =0 ;
		System.out.println("ID를 입력하세요 : ");String id	 = 예매프로그램.scanner.next();
		
		for(int i = 0 ; i<list.영화회원목록.size(); i++) {
									//리스트내 객체 수
			if(list.영화회원목록.get(i).id.equals(id)) {
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
	public void 鍮꾪쉶�썝�삁留�() {
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

