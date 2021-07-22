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
					System.out.println( "The total Monthly Salary of the Employee is  " + totalSalary+"\n" );

		return totalSalary;
	}

	public static void main(String[] args) {
		
		EmployeeWageComputation Dmart = new EmployeeWageComputation();				//Creating Object
		System.out.println("Employee Wage Calculation for Dmart"+"\n");
		Dmart.computeEmpWage(100,150,25);		// Set the values of wagePerHour,maxHrinMonth and numWorkingDays
		
		
		EmployeeWageComputation Vishal = new EmployeeWageComputation();
		System.out.println("Employee Wage Calculation for Vishal"+"\n");
		Vishal.computeEmpWage(150,200,22);
		System.out.println(" ");
		
		EmployeeWageComputation Bigbazar = new EmployeeWageComputation();
		System.out.println("Employee Wage Calculation for Bigbazar"+"\n");
		Bigbazar.computeEmpWage(200,120,26);
	}

}
