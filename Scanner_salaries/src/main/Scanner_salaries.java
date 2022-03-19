package main;

import java.io.File;
import java.util.Scanner;

public class Scanner_salaries {
	public static void main(String[] args) throws Exception {
		
		int total = 0;
		Scanner scan = new Scanner(new File("Salaries.csv"));
		Scanner scan2 = null;
		scan.nextLine(); //제목줄 버림
		
		while(scan.hasNext()) { //한줄씩 줄이 없을때 까지
			String str = scan.nextLine(); //한줄 받고
			scan2 = new Scanner(str).useDelimiter(","); //그줄에서 ,로 나누고
			for(int i = 0; i < 5; i++){
				   scan2.next(); //5번째 까지 값을 버려줍니다
			}
			total += scan2.nextInt(); //6 번쨰가 될경우 더하기
		}

		System.out.println("salary 합 :" + total );
		
	}
}
