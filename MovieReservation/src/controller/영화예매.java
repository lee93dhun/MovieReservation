package controller;

import java.util.Scanner;

import domain.��ȭȸ��;
import domain.Ű����ũ;


public class ��ȭ���� {
	
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		
		System.out.println("==========��ȭ�������α׷�==========");
		System.out.println("1.ȸ������     2. �α���      3.����");
		
		Ű����ũ Ű����ũ = new ��ȭȸ��();
		int ���� = scanner.nextInt();
		if( ���� == 1) { Ű����ũ.ȸ������(); }
		if( ���� == 2) { Ű����ũ.�α���();}
		if( ���� == 3) { System.out.println("------> ���� ���α׷� ����");}
			
		
	
	}

}
