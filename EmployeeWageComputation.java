package com.EmployeeWage;

import java.util.Scanner;

class CompanyWage {

	public String company;
	public int wagePerHr;
	public int maxMonthHr;
	public int workingDays;
	public int fullTimeHr;
	public int partTimeHr;
	public int totalEmpWage;

	public CompanyWage(String company, int wagePerHr, int maxMonthHr, int workingDays, int fullTimeHr, int partTimeHr) {
		this.company = company;
		this.wagePerHr = wagePerHr;
		this.maxMonthHr = maxMonthHr;
		this.workingDays = workingDays;
		this.fullTimeHr = fullTimeHr;
		this.partTimeHr = partTimeHr;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	public String toString() {
		return "Total Emp Wage For Company: " + company + " is " + totalEmpWage;
	}
}

class EmpWageArray {
	private static final int IS_FULL_TIME = 1;
	private static final int IS_PART_TIME = 2;

	private int numOfCompany = 0;
	private CompanyWage[] companyWageArray;
	public char[] EmpWageArray;

	public EmpWageArray(int a) {
		companyWageArray = new CompanyWage[a];
	}

	public void addCompanyEmpWage(String company, int wagePerHr, int maxMonthHr, int workingDays, int fullTimeHr,
			int partTimeHr) {
		companyWageArray[numOfCompany] = new CompanyWage(company, wagePerHr, maxMonthHr, workingDays, fullTimeHr,
				partTimeHr);
		numOfCompany++;
	}

	public void computeEmpWage() {
		for (int i = 0; i < numOfCompany; i++) {
			companyWageArray[i].setTotalEmpWage(computeEmpWage(companyWageArray[i].company,
					companyWageArray[i].wagePerHr, companyWageArray[i].maxMonthHr, companyWageArray[i].workingDays,
					companyWageArray[i].fullTimeHr, companyWageArray[i].partTimeHr));
			System.out.println(companyWageArray[i]);
		}
	}

	public static int computeEmpWage(String company, int wagePerHr, int maxMonthHr, int workingDays, int fullTimeHr,
			int partTimeHr) {
		int empHr = 0;
		int totalEmpHr = 0;
		int days = 0;

		while (empHr <= maxMonthHr && days <= workingDays) {

			double empCheck = (int) (Math.random() * 3);
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
		return totalWage;
	}
}

public class EmployeeWageComputation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Company want to add");
		int companysCount = sc.nextInt();
		EmpWageArray obj = new EmpWageArray(companysCount);
		for (int i = 0; i < companysCount; i++) {
			System.out.println("Enter Details for Company: " + (i + 1));
			System.out.println("");
			System.out.println("Company Name: ");
			String cmpnyName = sc.next();
			System.out.println("Company Wage Per Hour");
			int wagePerHr = sc.nextInt();
			System.out.println("Company Max Month Hour");
			int maxMonthHr = sc.nextInt();
			System.out.println("Company Month Work Days");
			int workDays = sc.nextInt();
			System.out.println("Company Full Time Hour");
			int fullTimeHr = sc.nextInt();
			System.out.println("Company Part Time Hour ");
			int partTimeHr = sc.nextInt();

			obj.addCompanyEmpWage(cmpnyName, wagePerHr, maxMonthHr, workDays, fullTimeHr, partTimeHr);
			obj.computeEmpWage();
		}
		for (int i = 0; i < companysCount; i++) {
			System.out.println(obj.EmpWageArray);
		}
	}

}