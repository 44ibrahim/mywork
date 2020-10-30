package day14_10;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter begining vlaue");
		int beg = scan.nextInt();
		System.out.println("Enter ending value");
		int end = scan.nextInt();
		
		if(beg<=end) {
			for(int i=beg; i<=end; i++) {
				if(i%2==0) {
					System.out.print(i + " ");
				}
					
				
			}
		}else {
			for( int i=beg; i>end; i-- ) {
				if(i%2==0) {
					System.out.print(i + " ");
				}
				
			}
		}
scan.close();
	}

}
