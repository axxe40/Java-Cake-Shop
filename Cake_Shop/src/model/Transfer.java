package model;

import java.util.Random;

public class Transfer {

	String Transferaddress;

	public Transfer() {
		this.Transferaddress = setAddress();
	}

	public void viewpayment(double price) {
		System.out.println("Payment type\t: Transfer");
		System.out.printf("Price\t\t: $%.1f with address : %s\n", price * 1.1, this.Transferaddress);
	}

	public String setAddress() {
		Random rn = new Random();

		String numbers = "1234567890";
		String uniqueId = " ";

		char[] id = new char[10];

		for (int j = 0; j < 10; j++) {
			id[j] = numbers.charAt(rn.nextInt(numbers.length()));
		}

		for (int k = 0; k < 10; k++) {
			uniqueId += id[k];
		}

		return uniqueId;
	}
}


