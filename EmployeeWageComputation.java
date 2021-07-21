package com.EmployeeWage;

public class EmployeeWageComputation {
	
	public void wageForMonth() {
		//Variables
		int wagePerHour = 20;
		int numWorkingDays=20;
		int empHr=0;
		int totalsalary=0;
		
			//Computation
		for (int day=1; day<= numWorkingDays; day++){

			int empCheck=(int) (Math.random()*3);

                switch  (empCheck) {
		            case 0:
		               	empHr=0;
		            	break;

		            case 1:
		            	empHr=8;    //Full day hours
						break;

		            case 2:
		            	empHr=4;	// Part time hours
		            	break;
                }
                
                int empDailyWage = empHr * wagePerHour ;   // Daily wages 
                
                totalsalary += empDailyWage;		//Employee Monthly Salary
		}

		System.out.println( "The total Monthly Salary of the Employee is  " + totalsalary );

	}

	public static void main(String [] args) {
	
	EmployeeWageComputation obj1 = new EmployeeWageComputation();		//Creating Objects
		obj1.wageForMonth();
		System.out.println("");
	}
}
