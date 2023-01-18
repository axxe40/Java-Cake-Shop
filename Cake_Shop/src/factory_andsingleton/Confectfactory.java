package factory_andsingleton;

import model.Confectionary; 
import model.Cupcake;
import model.Tart;

public class Confectfactory {
    
	private static Confectfactory instance;
	
	public static Confectfactory getinstance() {
		if(instance == null)  
		instance = new Confectfactory();
		return instance;
	}
	
	public Confectionary makeCake(String type) {
		
		if(type.equals("Cupcake"))
		{
			return new Cupcake();
		}
		else if(type.equals("Tart"))
		{
			return new Tart();
		}
		
	  return null;
	}

}
