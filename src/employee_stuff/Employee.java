package employee_stuff;



public class Employee {
	protected int number;
	private float salary;
	private String firstName;
	private String lastName;
	public float bonus;
	private static final float DEFAULT_BONUS = 200f;
	private static final float MIN_SALARY = 7000f;


	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	public float calcPay() {
		return getSalary() / 12;
	}

	public String toString() {
		return String.format("Employee %d: %s %s, £%.2f, £%.2f per month.",
				this.number, this.getFirstName(), this.getLastName(), this.getSalary(), this.calcPay());
	}

}
