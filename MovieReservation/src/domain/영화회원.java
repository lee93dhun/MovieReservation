package domain;

import controller.��ȭ����;

public class ��ȭȸ�� {
	
	
	private String id;
	private String password;
	private String name;
	private String email;
	
	
	public ��ȭȸ��() { }

	public ��ȭȸ��(String id, String password, String name, String email) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
	}
	
	// ȸ������ �޼ҵ�
	public void ȸ������() {
		
		System.out.println("=========ȸ������==========");
		System.out.println("ID�� �Է��ϼ��� : "); String id	 = ��ȭ����.scanner.next();
		System.out.println("Password�� �Է��ϼ��� : "); String password	 = ��ȭ����.scanner.next();
		System.out.println("�̸��� �Է��ϼ��� : "); String name	 = ��ȭ����.scanner.next();
		System.out.println("E-mail�� �Է��ϼ��� : "); String email	 = ��ȭ����.scanner.next();
		
		��ȭȸ�� temp = new ��ȭȸ��(id, password, name, email);
		��ȭȸ�����.��ȭȸ�����.add(temp)
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
