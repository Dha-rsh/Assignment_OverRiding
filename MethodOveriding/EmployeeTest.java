package MethodOveriding;



class Employee {
 String name;
 int id;

 public Employee(String name, int id) {
     this.name = name;
     this.id = id;
 }

 
 public void getEmployeeDetails() {
     System.out.println("Employee ID: " + id + ", Name: " + name);
 }
}


class HourlyEmployee extends Employee {
 double hourlyRate;
 int hoursWorked;

 public HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked) {
     super(name, id);
     this.hourlyRate = hourlyRate;
     this.hoursWorked = hoursWorked;
 }

 
 @Override
 public void getEmployeeDetails() {
     super.getEmployeeDetails();
     System.out.println("Hourly Rate: " + hourlyRate + ", Hours Worked: " + hoursWorked);
 }
}


class SalariedEmployee extends Employee {
 double salary;

 public SalariedEmployee(String name, int id, double salary) {
     super(name, id);
     this.salary = salary;
 }

 
 @Override
 public void getEmployeeDetails() {
     super.getEmployeeDetails();
     System.out.println("Salary: " + salary);
 }
}


public class EmployeeTest {
 public static void main(String[] args) {
     Employee emp1 = new HourlyEmployee("dharsh", 101, 8.00, 12);
     Employee emp2 = new SalariedEmployee("priya", 102, 60000);


     emp1.getEmployeeDetails();
     System.out.println("--------------------");
     emp2.getEmployeeDetails();
 }
}

