package jo.secondstep.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestRestorant {

	public static void main(String[] args) {
		Map<String, Item> resturantMenu = new HashMap<String, Item>();
		resturantMenu.put("A", new Item("A", 50));
		resturantMenu.put("B", new Item("B", 30));
		resturantMenu.put("C", new Item("C", 20));
		resturantMenu.put("D", new Item("D", 100));

		Resturant resturant = new Resturant("Shawrma", "Irbid", 210102, resturantMenu);

		Customer customer1 = new Customer("Hadeel", "1996", "Hoson", 79);
		ArrayList<String> myOrder = new ArrayList<String>();
		myOrder.add("A");
		myOrder.add("B");
		myOrder.add("Y");
		myOrder.add("C");
		resturant.order(myOrder);
		resturant.calculateBill();
		customer1.setMyBill(resturant.getUserBill());
		customer1.printBill();

	}
}
