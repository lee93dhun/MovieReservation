package domain;

public class CGV extends ��ȭ�� {
	int ������ȣ = 02;
	int �ݾ�;

	public CGV() {
	}

	@Override
	public void �޴�() {
		while (true) {
			System.out.println("CGV �޴�");
			System.out.println("1.�α��� 2.ȸ������ 3. ���� 4. ����");
			int ���� = sc.nextInt();
			if (���� == 1) {
				�α���();
			}
			if (���� == 2) {
				ȸ������();
			}
			if (���� == 3) {
				����();
			}
			if (���� == 4) {
				����();
				break;
			}
		}

	}

	@Override
	public void ����() {
		
		super.����();
	}

	@Override
	public void �α���() {
	
		super.�α���();
	}

	@Override
	public void ȸ������() {
	
		super.ȸ������();
	}

	@Override
	public void ����() {
	
		super.����();
	}

}
