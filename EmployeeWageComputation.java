package com.EmployeeWage;

import java.util.Scanner;

public class EmployeeWageComputation {
	
	public int computeEmpWage(int wagePerHour,int maxHrinMonth,int numWorkingDays) {
		//Variables
		int totalSalary=0;
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
				 	totalSalary = totalEmpHr * wagePerHour;
				
					System.out.println( "Total Number of Working days in a Month is  " + totalWorkingDay );
					System.out.println( "Total Employee Hour in a month  is  " + totalEmpHr );
					System.out.println( "The total Monthly Salary of the Employee is  " + totalSalary );

		return totalSalary;
	}

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
	EmployeeWageComputation obj1 = new EmployeeWageComputation();		//Creating Objects
		
		System.out.println("Enter Wage Per Hours :-");
		int wagePerHour = sc.nextInt();
		System.out.println("Enter the Maximun Hours in a Month :-");
		int maxHrinMonth= sc.nextInt();
		System.out.println("Enter Number of Working Day in a Month :-");
		int numWorkingDays= sc.nextInt();
		
		obj1.computeEmpWage(wagePerHour,maxHrinMonth,numWorkingDays);
		System.out.println("");
	}
}
