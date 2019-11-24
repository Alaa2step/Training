package jo.secondstep.task5;

public class Customer extends Person {

	private String location;
	private int phoneNumber;

	public Customer(String name, String dateOfBirth, String location, int phoneNumber) {
		super(name, dateOfBirth);
		this.location = location;
		this.phoneNumber = phoneNumber;
	}

	private Bill myBill;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setMyBill(Bill myBill) {
		this.myBill = myBill;
	}

	public void printBill() {
		myBill.printBill();
	}

}
