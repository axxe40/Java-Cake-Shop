package program;

import java.util.ArrayList;
import java.util.Scanner;

import factory_andsingleton.Confectfactory;
import model.Confectionary;

public class Main {
	Scanner sc = new Scanner(System.in);
	ArrayList<Confectionary> confectionary = new ArrayList<>();

	public Main() {
		int m;
		do {

			System.out.println("Cake Shop");
			System.out.println("===========================");
			System.out.println("1. Bake Confectionary");
			System.out.println("2. View Confectionary order");
			System.out.println("3. exit");
			System.out.print(">> ");
			m = sc.nextInt();
			sc.nextLine();

			if (m == 1) {
				bakeConfectionary();
			} else if (m == 2) {
				viewConfectionary();
			}
		} while (m != 3);

	}

	public void bakeConfectionary() {
		Confectfactory cf = Confectfactory.getinstance();
		String type = "";
		do {
			System.out.print("Input confectionary type [ Cupcake | Tart]: ");
			type = sc.nextLine();
		} while (!(type.equals("Cupcake") || type.equals("Tart")));
		confectionary.add(cf.makeCake(type));
	}

	public void viewConfectionary() {
		for (Confectionary c : confectionary) {
			c.prinDetail();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
