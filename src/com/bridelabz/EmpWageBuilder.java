package com.bridelabz;

import java.util.ArrayList;
import java.util.Scanner;

    public class EmpWageBuilder{
        public static ArrayList<CompanyEmpWage> comp_emp_wages=new ArrayList<>();

        public static void add_Company(String comp_name,int wage,int work_Days,int work_hrs){
            CompanyEmpWage ob1=new CompanyEmpWage(comp_name, wage,work_Days,work_hrs);
            comp_emp_wages.add(ob1);
        }
        public static void display_single_company_wages(String comp_name){
            System.out.println("Company Employee Wages are");
            for (int i = 0; i < comp_emp_wages.size(); i++) {
                if (comp_emp_wages.get(i).companyName.equals(comp_name)) {
                    CompanyEmpWage temp_obj = comp_emp_wages.get(i);
                    System.out.print("Company Name: "+temp_obj.companyName+
                            //"Company Wage: "+temp_obj.companyWage+
                            "Employee Name: "+temp_obj.emp_Name+
                            "Total Wage"+temp_obj.total_wage_per_emp);
                    System.out.println();
                }
            }
        }
        public static void display_all_companies_wages(){
            for (int i = 0; i < comp_emp_wages.size(); i++) {
                CompanyEmpWage temp_obj = comp_emp_wages.get(i);
                System.out.print("Company Name: "+temp_obj.companyName+
                        //"Company Wage: "+temp_obj.companyWage+
                        " Employee Name: "+temp_obj.emp_Name+
                        " Total Wage: "+temp_obj.total_wage_per_emp);
                System.out.println();
            }
        }

        public static void main(String[] args) {
            System.out.println("Welcome to EmployeeWage Calculation");
            Scanner sc=new Scanner(System.in);
            String comp_name;
            int choice=5;   //random value
            String searchName=null;
            while (choice != 0) {
                System.out.println("Select one of the below options");
                System.out.println(" 0. Exit. ");
                System.out.println(" 1. Add Company. ");
                System.out.println(" 2. Add Emp & Calculate Wage. ");
                System.out.println(" 3. Display Single Company Wages. ");
                System.out.println(" 4. Display all Company Wages. ");
                choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        System.out.println("Enter the new company name:");
                        comp_name=sc.nextLine();
                        System.out.println("Enter the CompanyWage");
                        int ip_companyWage = sc.nextInt();
                        System.out.println("Enter the Company No.of Working Days (limit)");
                        int ip_working_days = sc.nextInt();
                        System.out.println("Enter the Company No.of Working Hours (limit)");
                        int ip_working_hrs = sc.nextInt();
                        add_Company(comp_name,ip_companyWage,ip_working_days,ip_working_hrs);
                        break;
                    case 2:
                        System.out.println("Enter the company name");
                        comp_name=sc.nextLine();
                        System.out.println("Enter the Employee Name");
                        String emp_name=sc.nextLine();
                        for (int i = 0; i < comp_emp_wages.size(); i++) {
                            if (comp_emp_wages.get(i).companyName.equals(comp_name)) {
                                CompanyEmpWage temp_obj = comp_emp_wages.get(i);
                                temp_obj.emp_Name=emp_name;
                                temp_obj.present_absent();
                                temp_obj.total_wage_calc();
                                comp_emp_wages.set(i, temp_obj);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Enter the company name");
                        comp_name=sc.nextLine();
                        display_single_company_wages(comp_name);
                        break;
                    case 4:
                        display_all_companies_wages();
                        break;
                }
            }
        }
    }


