package adapter;

import model.Cash; 
import model.Crypto;

public class Cryptoadapter extends Cash{
	
    private Crypto crypto;
    
    public Cryptoadapter() {
    	this.crypto = new Crypto();
  }
   public void viewpayment(double price) {
	   this.crypto.viewpayment(price);
   }
}
