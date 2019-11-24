package jo.secondstep.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Resturant implements OrderingProcess {

	private ArrayList<Employee> employees = new ArrayList<Employee>();
	private Map<String, Item> menuList = new HashMap<String, Item>();
	private ArrayList<Item> userOrderList = new ArrayList<Item>();
	private String resturantName;
	private String location;
	private int phoneNumber;
	private Bill userBill;
	private static int counter = 1;

	public Resturant(String resturantName, String location, int phoneNumber, Map<String, Item> map) {
		this.resturantName = resturantName;
		this.location = location;
		this.phoneNumber = phoneNumber;
		this.menuList = map;
	}

	@Override
	public void order(ArrayList<String> orderList) {
		// userOrderList=orderList;
		for (int i = 0; i < orderList.size(); i++) {
			String option = orderList.get(i);
			if (menuList.containsKey(option))
				userOrderList.add(new Item(option, menuList.get(option).getPrice()));
		}

	}

	@Override
	public void calculateBill() {
		int cost = 0;
		for (int i = 0; i < userOrderList.size(); i++) {
			Item item = userOrderList.get(i);
			cost += item.getPrice();
		}

		userBill = new Bill(cost, counter);
		userBill.setYourOrder(userOrderList);

	}

	public void addNewEmployee(String name, int id, String role, String birth) {
		employees.add(new Employee(name, birth, id, role));
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public Map<String, Item> getMenuList() {
		return menuList;
	}

	public ArrayList<Item> getUserOrderList() {
		return userOrderList;
	}

	public String getResturantName() {
		return resturantName;
	}

	public String getLocation() {
		return location;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public Bill getUserBill() {
		return userBill;
	}
}
