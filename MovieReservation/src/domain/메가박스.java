package domain;


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
<<<<<<< HEAD
	public void �α���() {
		System.out.println("===========�ް��ڽ� �α���===========");
		ȸ��.�α���();
		
	}

	@Override
	public void ȸ������() {
		System.out.println("==========�ް��ڽ� ȸ������==========");
		ȸ��.ȸ������();
	}
 
	
=======
	public void 로그인() {
		System.out.println("===========메가박스 로그인===========");
		회원.로그인();
		
	}

>>>>>>> refs/remotes/origin/master
	@Override
	public void 회원가입() {
		System.out.println("==========메가박스 회원가입==========");
		회원.회원가입();
	}
 
	
	@Override
	public void 종료() {

		super.종료();
	}

}
