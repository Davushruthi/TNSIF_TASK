import com.shruthi.assignment.employees.Manager;
import com.shruthi.assignment.employees.Developer;
import com.shruthi.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {

	public static void main(String[] args) {
		 Manager manager = new Manager("Shruthi", 38, 55000, "IT");
		 
		 Developer dev = new Developer("Namjoon", 34, 1000000, "Java");
		 
		 EmployeeUtilities.displayEmployee(manager);
		 System.out.println("Department: " + manager.getdepartment());
		 
		 System.out.println();
		 
		 EmployeeUtilities.displayEmployee(dev);
		 System.out.println("Programming Language: " + dev.getProgrammingLanguage());

	}

}
