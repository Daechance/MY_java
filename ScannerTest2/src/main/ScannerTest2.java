package main;

import java.util.Scanner;
public class ScannerTest2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		do {
			System.out.print("값을 입력하세요. 입력을 마치려면 Q를 입력하세요:");
			input = scan.nextLine();
			System.out.println("입력하신 값은 " + input + " 입니다." );
		}while(!input.equalsIgnoreCase("q"));
		
		System.out.println("프로그램을 종료합니다.");
		scan.close();
	}
}
