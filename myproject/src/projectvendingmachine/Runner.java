package projectvendingmachine;

import projectvendingmachine.Methods;
import projectvendingmachine.Products;

public class Runner {

	public static void main(String[] args) {
		double accountBalance = 10;
		Products product = new Products();		
		Methods method = new Methods();
		
		System.out.println("Hi, welcome!...");
		System.out.println("Your current balance: $" + accountBalance);

		
		product.setPrice(method.select(product ));
		accountBalance = method.balance(product.getPrice(), accountBalance, product );
		method.purchase(product.getPrice(), accountBalance, product);

	}

}
