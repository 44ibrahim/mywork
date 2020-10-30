package day14_10;

import java.util.Scanner;

public class Loop02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = scan.nextInt();
		if(a>0) {
			
			for(int i = a; i>0; i--) {
				if(i%2==1) {
					System.out.print(i + " ");
				}
			}
		}else {
			System.out.println("Enter a bigger and positive number");
		}
scan.close();
	}

}
