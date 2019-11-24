package jo.secondstep.task5;

public class Item {

	private String name;
	private int price;
	private int id;
	private static int count = 1;

	public Item(String name, int price) {
		this.name = name;
		this.price = price;
		this.id = ++count;
	}

	public Item(Item item) {
		this.name = item.getName();
		this.price = item.getPrice();
		this.id = ++count;
	}

	public String getName() {
		return name;
	}

	public void setName(String nameString) {
		this.name = nameString;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Item.count = count;
	}

	@Override
	public String toString() {
		return "Item id= " + id + " Item name: " + name + " " + "price = " + price;
	}

}
