package SampleProject;

public class TestCompany {

	public static void main(String[] args) {
		Employee alex = new Employee("Alex", 6);
		Employee linda = new Employee("Linda", 7);
		Employee john = new Employee("John", 4);
		Employee sara = new Employee("Sara", 5);
		Employee james = new Employee("James", 3);
		Department sales = new Department("Sales");
		Department it = new Department("IT");
		sales.addEmployee(alex);
		sales.addEmployee(linda);
		sales.addEmployee(john);
		it.addEmployee(sara);
		it.addEmployee(james);
		sales.display();
		it.display();

	}

}
