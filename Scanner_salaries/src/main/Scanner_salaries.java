package main;

import java.io.File;
import java.util.Scanner;

public class Scanner_salaries {
	public static void main(String[] args) throws Exception {
		
		int total = 0;
		Scanner scan = new Scanner(new File("Salaries.csv"));
		Scanner scan2 = null;
		scan.nextLine(); //������ ����
		
		while(scan.hasNext()) { //���پ� ���� ������ ����
			String str = scan.nextLine(); //���� �ް�
			scan2 = new Scanner(str).useDelimiter(","); //���ٿ��� ,�� ������
			for(int i = 0; i < 5; i++){
				   scan2.next(); //5��° ���� ���� �����ݴϴ�
			}
			total += scan2.nextInt(); //6 ������ �ɰ�� ���ϱ�
		}

		System.out.println("salary �� :" + total );
		
	}
}
