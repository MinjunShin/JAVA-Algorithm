package chap04;

import java.util.Scanner;

public class Ex_3_Tester {
	

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		Ex_3_BothSideStack s = new Ex_3_BothSideStack(64);
		
		System.out.println("���� ������ �� : " + s.size() + " / " + s.capacity());
		System.out.print("(1) Ǫ�� (2)�� (3)��ũ (4)���� (0)����");
		int menu = stdIn.nextInt();
		if(menu == 0) break;
		
		int x;
		switch(menu) {
		 case 1 :
			System.out.println("������ �Է� : ");
			x = stdIn.nextInt();
			try {
				s.push(x);
			} catch (IntStack.OverflowIntStackException e) {
				System.out.println("������ ���� á���ϴ�.");
			}
			break;
			
		 case 2 :
			 try {
				 x = s.pop();
				 System.out.println("pop�� �����ʹ� " + x + " �Դϴ�.");
			 } catch (IntStack.EmptyIntStackException e) {
				 System.out.println("������ ����ֽ��ϴ�.");
			 }
			 break;

	}

}