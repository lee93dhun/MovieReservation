package controller;

import java.util.Scanner;

import domain.CGV;
import domain.����;
import domain.�Ե��ó׸�;
import domain.�ް��ڽ�;
import domain.Ű����ũ;





public class �������α׷� {
	
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		System.out.println("======== ��ȭ ���� ���α׷� ========");
		System.out.println("��ȭ�� ����---------------------->");
		System.out.println("1.�ް��ڽ� 2.CGV 3. �Ե��ó׸� 4.����");
		int ���� = �������α׷�.scanner.nextInt();
		
		Ű����ũ Ű����ũ = null;
		Ű����ũ = new ����();
		
		if( ���� == 1 ) { 
			System.out.println("-------> �ް��ڽ� �޴� ");
			Ű����ũ = new �ް��ڽ�();
			Ű����ũ.�޴�();
		}
		if( ���� == 2 ) { 
			System.out.println("-------> CGV �޴�");
			Ű����ũ = new CGV();
			Ű����ũ.�޴�();
		}
		if( ���� == 3 ) { 
			System.out.println("------> �Ե��ó׸� �޴�");
			Ű����ũ = new �Ե��ó׸�();
			Ű����ũ.�޴�();
		}
		if( ���� == 4 ) { 
			System.out.println("---------- ���α׷� ���� ---------- ");
			return;
	}
			
			
			
			
			
		
	}	// main end

}	// class end
