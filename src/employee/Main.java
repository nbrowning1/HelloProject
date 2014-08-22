package employee;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import employee_stuff.Employee;
import employee_stuff.SalesEmployee;

public class Main {
	
	static Logger log = Logger.getLogger("");
	
	private static void setupLog(){
		try {
			log.setLevel(Level.INFO);
			Handler h =
					new FileHandler("%h/Hello-%g.log", 1500, 10, true);
			h.setFormatter(new SimpleFormatter());
			log.addHandler(h);
		} catch (IOException e) {
			System.err.println("IOException opening log file: " + e);
		}
	}

	public static void main(String[] args) {
		System.out.println("compiled successfully");
		
		Employee emp = new Employee();
		emp.setSalary(500.00f);
		emp.setSalary(600.00f);
		
		SalesEmployee semp = new SalesEmployee();
		semp.setCommissionRate(0.5f);
	}

}
