package main;



public class �ް��ڽ� extends ��ȭ�� {
	

	int ������ȣ = 01;
	int �ݾ�;

	public �ް��ڽ�() {
	}

	@Override
	public void �޴�() {
		while (true) {
			System.out.println("�ް��ڽ� �޴�");
			System.out.println("1.�α��� 2.ȸ������ 3. ���� 4. ����");
			int ���� = ��ȭ��.sc.nextInt();
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

	}

	@Override
	public void �α���() {

	}

	@Override
	public void ȸ������() {

	}

	@Override
	public void ����() {

		super.����();
	}

}
