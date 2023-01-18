package factory_andsingleton;

import adapter.Cryptoadapter;  
import adapter.Transferadapter;
import model.Cash;
 

public class Paymentfactory {
	
	private static Paymentfactory instance;

	public static Paymentfactory getinstance() {
		if(instance == null)  
			instance = new Paymentfactory();
		return instance;
	}
	
	public Cash setpayment(String type) {
		if(type.equals("Cash"))
		{
			return new Cash();
		}
		else if(type.equals("Transfer"))
		{
			return new Transferadapter();
		}
		else if(type.equals("Crypto"))
		{
			return new Cryptoadapter();
		 }
		return null;
		
	}
}

