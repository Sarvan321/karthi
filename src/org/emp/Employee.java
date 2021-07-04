package org.emp;

public class Employee {
public void empId() {
	System.out.println("empID");
}
public void empName() {
System.out.println("empName");
}
public void empDob() {
	System.out.println("empDob");
}
public void empPhone() {
System.out.println("empPhone");
}
public void empMail() {
	System.out.println("empMail");
}
public void empAddress() {
System.out.println("empAddress");
}
public static void main(String[] args) {
	Employee E = new Employee();
	E.empId();
	E.empName();
	E.empDob();
	E.empPhone();
	E.empMail();
	E.empAddress();
}
}
