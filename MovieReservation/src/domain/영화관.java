package domain;

import java.util.Scanner;

public static

public class ��ȭ�� implements Ű����ũ {
	
	int �ݾ�;
	String ���̵�;
	String ��й�ȣ;
	String �̸�;

	@Override
	public void �޴�() {
		System.out.println("��ȭ�� ����");
		System.out.println("1.�ް��ڽ� 2.CGV 3.�Ե��ó׸�");
		int ���� = sc.nextInt();
		if (���� == 1) {
			�ް��ڽ� �ް��ڽ� = new �ް��ڽ�();
			�ް��ڽ�.�޴�();
		}
		if (���� == 2) {
			CGV cgv = new CGV();
			cgv.�޴�();

		}
		if (���� == 3) {
			�Ե��ó׸� �Ե��ó׸� = new �Ե��ó׸�();
			�Ե��ó׸�.�޴�();

		}

	}

	@Override
	public void ����() {
		System.out.println("���� ����");

	}

	@Override
	public void �α���() {
		System.out.println("�α��� ����");

	}

	@Override
	public void ȸ������() {
		System.out.println("ȸ������ ����");

	}

	@Override
	public void ����() {

		Ű����ũ.super.����();
	}

}
