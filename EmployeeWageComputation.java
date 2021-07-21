package com.EmployeeWage;

public class EmployeeWageComputation {

	public void switchCase() {
		//Variables
	int empCheck=(int) (Math.random()*3);   //Using random check whether Employee is Present or Absent
	int wagePerHour = 20;
	int fulldayHour = 8;
	int partTimeHour = 4;
			//Computation
            switch  (empCheck) {
	         	case 0:
	         		System.out.println("Employee is Absent " );
	         		break;

	         	case 1:
	         		int empFulldayWage =  wagePerHour * fulldayHour ;
	         		System.out.println("Employee is Present and Employee fullday Wage is " + empFulldayWage);
	         		break;

	         	case 2:
	         		int empHalfdayWage =  wagePerHour * partTimeHour ;
	         		System.out.println("Employee is Present and Employee half day Wage is " + empHalfdayWage);
	         		break;
            }
}
	public static void main(String [] args) {
	
	EmployeeWageComputation obj1 = new EmployeeWageComputation();		//Creating Objects
		obj1.switchCase();
		System.out.println("");

	}
}
