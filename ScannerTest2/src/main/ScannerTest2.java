package main;

import java.util.Scanner;
public class ScannerTest2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		do {
			System.out.print("���� �Է��ϼ���. �Է��� ��ġ���� Q�� �Է��ϼ���:");
			input = scan.nextLine();
			System.out.println("�Է��Ͻ� ���� " + input + " �Դϴ�." );
		}while(!input.equalsIgnoreCase("q"));
		
		System.out.println("���α׷��� �����մϴ�.");
		scan.close();
	}
}
