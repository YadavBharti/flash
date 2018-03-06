package SampleProject;

public class Department {
	private String deptName;
	private double budget;
	int counter = 0;
	
	Employee[] emp = new Employee[5];
	
	public Department(String deptName){
		this.deptName = deptName;
		this.budget = 50000;
	}
	
	
	public void addEmployee(Employee obj){
		emp[counter] = obj;
		counter++;
		if(obj.getGrade() >= 5){
			this.budget += 150000;
		}else{
			this.budget +=10000;
		}
	}
	
	public void display(){
		String temp = "Dept Name:" + this.deptName +
				       "\nBudget:" + this.budget + 
				       "\nEmployees:";
		for(Employee x : emp){
			if(x!= null){
				temp += x.employeeInfo();
			}
		}
		System.out.println(temp);
	}
	

}
