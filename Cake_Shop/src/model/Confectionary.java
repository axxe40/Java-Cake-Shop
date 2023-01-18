package model;

import java.util.ArrayList;
import java.util.Scanner;

import factory_andsingleton.Paymentfactory;

public abstract class Confectionary {

	String Name;
	String Softness;
	ArrayList<String> Topping;
	String Paymentype;
	Double price;
	Cash cash;

	public abstract void show();

	public Confectionary() {
		Scanner sc = new Scanner(System.in);
		String name = null;
		int count = 1;
		do {
			System.out.print("Input confectionary name [length between 5 - 15]: ");
			name = sc.nextLine();
		} while (name.length() < 5 || name.length() > 15);
		this.Name = name;

		String softness = null;
		do {
			System.out.print("Input confectionary softness [Fluffy | Medium | Hard][case sensitive]: ");
			softness = sc.nextLine();
		} while (!(softness.equals("Fluffy") || softness.equals("Medium") || softness.equals("Hard")));
		this.Softness = softness;

		ArrayList<String> topping = new ArrayList<>();
		String toppingOpt = null;
		do {
			System.out.print("Addding additional topping [Y | N]: ");
			toppingOpt = sc.nextLine();
		} while (!(toppingOpt.equals("Y") || toppingOpt.equals("N")));

		if (toppingOpt.equals("Y")) {
			for (int i = 1; i <= 3; i++) {
				String toppingName = null;
				do {
					System.out.print("Input topping name(minimum 3) " + count + ". [length between 1 - 10]: ");
					toppingName = sc.nextLine();
					count += 1;
				} while (toppingName.length() < 1 || toppingName.length() > 10);
				topping.add(toppingName);
			}
		}
		this.Topping = topping;

		double price = 0;
		do {
			System.out.print("Input confectionary price [10.0 - 50.0]: ");
			price = sc.nextFloat();
			sc.nextLine();
		} while (price < 10 || price > 50);
		this.price = price;

		String type = null;
		do {
			System.out.print("What kind of payment [Cash | Transfer | Crypto]: ");
			type = sc.nextLine();
		} while (!(type.equals("Cash") || type.equals("Transfer") || type.equals("Crypto")));

		Paymentfactory pf = Paymentfactory.getinstance();
		this.cash = pf.setpayment(type);
	}

	public void prinDetail() {
		System.out.printf("Name\t\t: %s ", this.Name);
	    show();
		System.out.printf("Softnesss\t: %s\n", this.Softness);
		System.out.printf("Topping\t\t:");
		if (!(this.Topping.isEmpty())) {
			for (String s : this.Topping) {
				System.out.printf(" %s", s);
			}
			System.out.println();
		} else {
			System.out.println(" -");
		}
		this.cash.viewpayment(this.price);
		System.out.println();
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSoftness() {
		return Softness;
	}

	public void setSoftness(String softness) {
		Softness = softness;
	}

	public ArrayList<String> getTopping() {
		return Topping;
	}

	public void setTopping(ArrayList<String> topping) {
		Topping = topping;
	}

	public String getPaymentype() {
		return Paymentype;
	}

	public void setPaymentype(String paymentype) {
		Paymentype = paymentype;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
