package domain;

import controller.��ȭ����;

public class ��ȭȸ�� implements Ű����ũ {
	
	
	
	
	private String id;
	private String password;
	private String name;
	private String email;
<<<<<<< HEAD
	private int ������ȣ; 
		
	
=======
	private int ������ȣ;
>>>>>>> branch 'master' of https://github.com/lee93dhun/MovieReservation
	
	
	public ��ȭȸ��() { }

<<<<<<< HEAD
	public ��ȭȸ��(String id, String password, String name, String email , int ������ȣ) {
=======
	public ��ȭȸ��(String id, String password, String name, String email, int ������ȣ) {
>>>>>>> branch 'master' of https://github.com/lee93dhun/MovieReservation
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.������ȣ = ������ȣ;
	}
	
	
	
	@Override
	public void �޴�() {
		
	}

	@Override
	public void ����() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void �α���() {
		
		System.out.println("ID�� �Է��ϼ��� : ");String id	 = ��ȭ����.scanner.next();
		System.out.println("Password�� �Է��ϼ��� : "); String password	 = ��ȭ����.scanner.next();
	}

	// ȸ������ �޼ҵ�
	public void ȸ������() {
		
		System.out.println("=========ȸ������==========");
		int ����ġ =0 ;
		while( true ) {
			System.out.println("ID�� �Է��ϼ��� : ");String id	 = ��ȭ����.scanner.next();
			
			for(int i = 0 ; i<list.��ȭȸ�����.size(); i++) {
										//����Ʈ�� ��ü ��
				if(list.��ȭȸ�����.get(i).id.equals(id)) {
								// i��°�� ���̵� ���������Էµ� ���̵�� �����ϸ�
					System.out.println("------>���� ������� ���̵��Դϴ�.[ �ٽ��Է� : N ���� ]");
					����ġ = 1 ;
					break;
				}
			}
		
<<<<<<< HEAD
		
			System.out.println("Password�� �Է��ϼ��� : "); String password	 = ��ȭ����.scanner.next();
			System.out.println("�̸��� �Է��ϼ��� : "); String name	 = ��ȭ����.scanner.next();
			System.out.println("E-mail�� �Է��ϼ��� : "); String email	 = ��ȭ����.scanner.next();
			
			��ȭȸ�� temp = new ��ȭȸ��(id, password, name, email , ������ȣ);
			list.��ȭȸ�����.add(temp);
			System.out.println("-------> ȸ������ ����");
			return;
		}
=======
		��ȭȸ�� temp = new ��ȭȸ��(id, password, name, email,������ȣ);
		��ȭȸ�����.��ȭȸ�����.add(temp);
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
