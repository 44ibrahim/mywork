package day14_10;

import java.util.Scanner;

public class Loop05 {

	public static void main(String[] args) {
		int toplam=0 ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first value");
		int a = scan.nextInt();
		System.out.println("Enter second value");
		int b = scan.nextInt();
		if(a<=b) {
			for(int i=a; i<=b; i++) {
				toplam = toplam + i;
				
			}
			System.out.print(toplam);
		}else {
			for(int i=a; i>=b; i--) {
				toplam = toplam +i;
				
			}
			System.out.print(toplam);
		}
scan.close();
	}

}
