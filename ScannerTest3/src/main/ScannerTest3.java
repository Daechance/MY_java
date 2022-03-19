package main;

import java.io.File;
import java.util.Scanner;

public class ScannerTest3 {
	public static void main(String[] args) throws Exception {
		
		Scanner sc1 = new Scanner(new File("score.txt"));
		Scanner sc2 = null;
		int cnt = 0; 
		int totalSum = 0;
		
		while(sc1.hasNextLine()) {
			String line = sc1.nextLine();
			sc2 = new Scanner(line).useDelimiter(",");
			int sum = 0;
			while(sc2.hasNextInt()) {
				sum += sc2.nextInt();
			}
			System.out.println(line+" sum=" +sum);
			totalSum+=sum;
			cnt++;
			sc2.close();
		}
		System.out.println("Line : "+cnt+", total :"+ totalSum );
		sc1.close();
	}

}
