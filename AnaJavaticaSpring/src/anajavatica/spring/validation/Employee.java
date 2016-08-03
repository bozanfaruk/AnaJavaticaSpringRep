package anajavatica.spring.validation;

public class Employee {

	private String id = "";
	private int wage = 0;

	public Employee(String id, int wage) {
		super();
		this.id = id;
		this.wage = wage;
	}

	public String getId() {
		return id;
	}

	public int getWage() {
		return wage;
	}

}
