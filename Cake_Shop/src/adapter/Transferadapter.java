package adapter;

import model.Cash;   
import model.Transfer;

public class Transferadapter extends Cash {
     private Transfer transfer;
     
	public Transferadapter() {
		this.transfer = new Transfer();
		
	}

	public void viewpayment(double price) {
		this.transfer.viewpayment(price);
	}
	
}
