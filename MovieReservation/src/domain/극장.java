package domain;

import controller.�������α׷�;

public class ���� extends ȸ�� implements Ű����ũ {
	
	// �ʵ�
	String ���̵�;
	String ��й�ȣ;
	String �̸�;
	
	// �� ������
	public ����() {}
	// ��� �ʵ� ������

	public ����(String ���̵�, String ��й�ȣ, String �̸�) {
		super();
		this.���̵� = ���̵�;
		this.��й�ȣ = ��й�ȣ;
		this.�̸� = �̸�;
	}

	@Override
	public void �޴�() {
		while (true) {
			System.out.println("1.�α��� 2.ȸ������ 3.���� 4.����");
			int ���� = �������α׷�.scanner.nextInt();
			if (���� == 1) �α���();
			if (���� == 2) ȸ������();
			if (���� == 3) ��ȸ������();
			if (���� == 4) return;
		}
	}  
	@Override
	public void �α���() {
		
	}
	@Override
	public void ȸ������() {
		
	}
	@Override
	public void ��ȸ������() {
		
	}
	

}
