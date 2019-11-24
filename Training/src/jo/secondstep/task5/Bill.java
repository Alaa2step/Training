package jo.secondstep.task5;

import java.util.ArrayList;

public class Bill {

	private int cost;
	private int id;
	private ArrayList<Item> yourOrder;

	public Bill(int cost, int id) {
		this.cost = cost;
		this.id = id;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Item> getYourOrder() {
		return yourOrder;
	}

	public void setYourOrder(ArrayList<Item> yourOrder) {
		this.yourOrder = yourOrder;
	}

	public void printBill() {
		System.out.println("Your bill id : " + id);
		for (int i = 0; i < yourOrder.size(); i++) {
			System.out.println(yourOrder.get(i).toString());
		}
		System.out.println("Your total cost = " + cost);
	}

}
