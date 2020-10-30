package day14_10;

import java.util.Scanner;

public class Loop07 {

	public static void main(String[] args) {
		int multiply =1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first value");
		int x = scan.nextInt();
		System.out.println("Enter your second value");
		int y = scan.nextInt();
		
		if(x>=y) {
			for(int i=x; i>=y; i--) {
				multiply = multiply*i;
			}
			System.out.println(multiply);
		}else {
			for(int i=x; i<=y; i++) {
				multiply = multiply*i;
			}
			System.out.println(multiply);
		}
scan.close();
	}

}
