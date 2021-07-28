package com.EmployeeWage;

class CompnyWage {

	public String company;
	public int wagePerHr;
	public int maxMonthHr;
	public int workingDays;
	public int fullTimeHr;
	public int partTimeHr;

	public CompnyWage(String company, int wagePerHr, int maxMonthHr, int workingDays, int fullTimeHr, int partTimeHr) {
		this.company = company;
		this.wagePerHr = wagePerHr;
		this.maxMonthHr = maxMonthHr;
		this.workingDays = workingDays;
		this.fullTimeHr = fullTimeHr;
		this.partTimeHr = partTimeHr;
	}
}

class EmpWageArray {
	private static final int IS_FULL_TIME = 1;
	private static final int IS_PART_TIME = 2;

	private int numOfCompany = 0;
	private CompnyWage[] compnyWageArray;

	public EmpWageArray() {
		compnyWageArray = new CompnyWage[5];
	}

	public void addCompanyEmpWage(String company, int wagePerHr, int maxMonthHr, int workingDays, int fullTimeHr,
			int partTimeHr) {
		compnyWageArray[numOfCompany] = new CompnyWage(company, wagePerHr, maxMonthHr, workingDays, fullTimeHr,
				partTimeHr);
		computeEmpWage(compnyWageArray[numOfCompany].company, compnyWageArray[numOfCompany].wagePerHr,
				compnyWageArray[numOfCompany].maxMonthHr, compnyWageArray[numOfCompany].workingDays,
				compnyWageArray[numOfCompany].fullTimeHr, compnyWageArray[numOfCompany].partTimeHr);
		numOfCompany++;
	}

	public static void computeEmpWage(String company, int wagePerHr, int maxMonthHr, int workingDays, int fullTimeHr,int partTimeHr) {
		int empHr = 0;
		int totalEmpHr = 0;
		int days = 0;

		while (empHr <= maxMonthHr && days <= workingDays) {

			double empCheck = (int) (Math.random()*3);
			int empCheck1 = (int) empCheck;

			switch (empCheck1) {
			case IS_FULL_TIME:
				empHr = fullTimeHr;
				break;
			case IS_PART_TIME:
				empHr = partTimeHr;
				break;
			default:
				empHr = 0;
			}
			totalEmpHr = totalEmpHr + empHr;
			days++;
		}
		int totalWage = totalEmpHr * wagePerHr;
		System.out.println("Total Wage For " + company + " Employee Is " + totalWage);
	}
}

public class EmployeeWageComputation {

	public static void main(String[] args) {

		EmpWageArray obj = new EmpWageArray();
		obj.addCompanyEmpWage("D-mart", 100, 150, 26, 8, 4);
		obj.addCompanyEmpWage("Vishal", 150, 170, 24, 10, 6);
	}

}