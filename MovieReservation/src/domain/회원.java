package domain;


public class ȸ�� implements Ű����ũ {
	
	
	
	
	private String id;
	private String password;
	private String name;
		
	
		
	
	// �� ������
	public ȸ��() { }
	// ��� �ʵ� ������
	public ȸ��(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
	@Override
	public void �޴�() {
	}


	@Override
	public void �α���() {
		
//		System.out.println("ID�� �Է��ϼ��� : ");String id	 = �������α׷�.scanner.next();
//		System.out.println("Password�� �Է��ϼ��� : "); String password	 = �������α׷�.scanner.next();
//			for( int i = 0; i<list.��ȭȸ�����.size(); i++ ) {
//				if( list.��ȭȸ�����.get(i).id.equals(id) && list.��ȭȸ�����.get(i).equals(password) ) {
//					System.out.println("�α��� ���� ---------------->");
//				}
//				else { System.out.println("�Է��Ͻ� ������ ��ġ���� �ʽ��ϴ�.");
//				}
//			}
		
	}

	@Override
	public void ȸ������() {
		
	}
	@Override
	public void ��ȸ������() {
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
