package domain;

import controller.�������α׷�;

public class �ް��ڽ� extends ���� {

	int ������ȣ = 01;
	int �ݾ�;
	ȸ�� ȸ�� = new ȸ��();
	
	public �ް��ڽ�() { }
	public �ް��ڽ�(String id, String password, String name) {
	}

	@Override
	public void �޴�() {
		super.�޴�();
	}

	@Override
	public void ��ȸ������() {
			
		}

	@Override
	public void �α���() {
		System.out.println("===========�ް��ڽ� �α���===========");
//		ȸ��.�α���();
	}

	@Override
	public void ȸ������() {
		System.out.println("==========�ް��ڽ� ȸ������==========");
		int ����ġ =0 ;
		System.out.println("ID�� �Է��ϼ��� : ");String id	 = �������α׷�.scanner.next();
	while( true ) {
		for(int i = 0 ; i<list.�ް��ڽ�ȸ�����.size(); i++) {
									//����Ʈ�� ��ü ��
			if(list.�ް��ڽ�ȸ�����.get(i).equals(id)) {
							// i��°�� ���̵� ���������Էµ� ���̵�� �����ϸ�
				System.out.println("------>���� ������� ���̵��Դϴ�.");
				����ġ = 1 ;
				break;
			}
		}
		if(����ġ == 0) {
			System.out.println("Password�� �Է��ϼ��� : "); String password	 = �������α׷�.scanner.next();
			System.out.println("�̸��� �Է��ϼ��� : "); String name	 = �������α׷�.scanner.next();
			
			�ް��ڽ� temp = new �ް��ڽ�(id, password, name );
			list.�ް��ڽ�ȸ�����.add(temp);
			System.out.println("-------> ȸ������ ����");
			return;
		}
	}
		
	}

	@Override
	public void ����() {

		super.����();
	}

}
