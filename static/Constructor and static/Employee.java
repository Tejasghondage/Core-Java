package statics.mathOperation;

public class Employee {
String employeeId;
String employeeName;
static double salary;
static String companyName;
static int employeeCount ;
Employee()
{
	this.employeeName="Unknown";
	this.employeeName="Unknown";
	Employee.salary=0.0;
	
}
Employee(String employeeName,double salary,String employeeId)
{
	this.employeeId=employeeId;
	this.employeeName=employeeName;
	Employee.salary=salary;
}
void raiseSalary(double amount)
{
	Employee.salary+=amount;
	System.out.println("Employee Salary Incresed by :"+amount);
}
void printEmployeeDetails()
{
	System.out.println("Employee ID :"+this.employeeId);
	System.out.println("Employee Name :"+this.employeeName);
	System.out.println("Employee Salary :"+Employee.salary);
	System.out.println("Company Name: "+Employee.companyName);
}
static void setCompanyName(String name) {
	Employee.companyName=name;
}
static void printEmployeeCount()
{
	System.out.println("Totla Employee Count :"+Employee.employeeCount);
}
static void printAllEmployees(Employee[] employees)
{
	 for (Employee e : employees) {
         System.out.println(e.employeeName + " | " + e.employeeId + " | " + (Employee.salary));
     }
}
public static void main(String[] args) {
	Employee[] empArray = {
            new Employee("Tejas", 101, "Developer"),
            new Employee("Rahul", 102, "Tester"),
            new Employee("Sneha", 103, "Manager")
        };
	empArray[1].raiseSalary(5965.65);
	Employee.setCompanyName("Trupti Solutions");
	Employee.printEmployeeCount();	
	empArray[1].printEmployeeDetails();
	Employee.printAllEmployees(empArray);
}
}
