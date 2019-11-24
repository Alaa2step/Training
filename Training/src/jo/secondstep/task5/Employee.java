package jo.secondstep.task5;

public class Employee extends Person {

	private int id;
	private String position;

	public Employee(String name, String dateOfBirth, int id, String position) {
		super(name, dateOfBirth);
		this.id = id;
		this.position = position;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
