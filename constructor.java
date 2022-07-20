package basics;

public class constructor {
	int empId;
	String empName;
	String department;
	float salary;
	public constructor() {
		empId=1;
		empName="bindu";
		department="software";
		salary=80000f;
	}
	public constructor(int empId,String empName,String department,float salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.department=department;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("Id: "+empId);
		System.out.println("Name: "+empName);
		System.out.println("department: "+department);
		System.out.println("salary: "+salary);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		constructor e=new constructor();
        constructor e1=new constructor(12,"bindu","Training",35000);
        e.display();
        e1.display();

	}

}
