package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import employee_stuff.Employee;

public class EmployeeTest {

	@Test
	public void testSetSalary() {
		Employee e = new Employee();
		e.setNumber(1);
		e.setSalary(8000f);
		assertEquals(8000f, e.getSalary(), 0.0001);
	}

}
