package com.EmployeeWage;

public class EmployeeWageComputation {
	
	public void condition() {
		//Variables
		int wagePerHour = 20;
		int maxHrinMonth= 100;
		int numWorkingDays=20;
		int totalsalary=0;
		int totalEmpHr=0;
		int totalWorkingDay=0;
		int empHr=0;

		//Computation
		while (totalEmpHr < maxHrinMonth && totalWorkingDay < numWorkingDays ) {

				totalWorkingDay++;

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

                	totalEmpHr+= empHr ;
			}
				 	totalsalary = totalEmpHr * wagePerHour;
				
					System.out.println( "Total Number of Working days in a Month is  " + totalWorkingDay );
					System.out.println( "Total Employee Hour in a month  is  " + totalEmpHr );
					System.out.println( "The total Monthly Salary of the Employee is  " + totalsalary );

		}

	public static void main(String [] args) {
	
	EmployeeWageComputation obj1 = new EmployeeWageComputation();		//Creating Objects
		obj1.condition();
		System.out.println("");
	
	}
}
