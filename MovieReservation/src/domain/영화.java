package domain;

import java.util.ArrayList;


public class ��ȭ {

	public static ArrayList<��ȭ> ��ȭ��� = new ArrayList<>();
	String ����;
	int ��ȭ��ȣ;
	int �ݾ�;
	
	
	
	public ��ȭ() {}
	
	public ��ȭ(String ����, int ��ȭ��ȣ,int �ݾ�) {
		this.���� = ����;
		this.��ȭ��ȣ = ��ȭ��ȣ;
		this.�ݾ� = �ݾ�;
		
	}
	public void ��ȭ1() {
		���� = "����";
		��ȭ��ȣ = 11;
		�ݾ� = 7000;
		��ȭ temp = new ��ȭ(����, ��ȭ��ȣ, �ݾ�);
		��ȭ.��ȭ���.add(temp);
		
		
	}
	public void ��ȭ2() {
		���� = "����";
		��ȭ��ȣ = 22;
		�ݾ� = 8000;
		��ȭ temp = new ��ȭ(����, ��ȭ��ȣ, �ݾ�);
		��ȭ.��ȭ���.add(temp);
		
	}
	public void ��ȭ3() {
		���� = "����";
		��ȭ��ȣ = 33;
		�ݾ� = 9000;
		��ȭ temp = new ��ȭ(����, ��ȭ��ȣ, �ݾ�);
		��ȭ.��ȭ���.add(temp);

	}


}
