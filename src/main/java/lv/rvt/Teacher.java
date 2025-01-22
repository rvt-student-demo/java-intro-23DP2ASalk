package lv.rvt;

public class Teacher extends Person {
	private int salary;

	public Teacher(String name, String address, int salary) {
		super(name, address);
		this.salary = salary;
    }
	public int getSalary() {
		return salary;
	}
	public String toString() {
		return super.getName() + '\n' + "  " + super.getAddress() + '\n' + "  salary " + this.getSalary() + " euro/month";
	}
}
