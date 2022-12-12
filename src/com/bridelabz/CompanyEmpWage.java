
package com.bridelabz;

    public class CompanyEmpWage {
        public int companyWage;
        public int numOfWorkingDays;
        public int workingHrsPerMonth;
        public String companyName="";
        public String emp_Name="";
        public int total_wage_per_emp=0;
        int Full_Time = 8;
        int Part_Time = 4;
        int a_count = 0;//absent days count
        int ft_count = 0;//fulltime days count
        int pt_count = 0;//part time days count
        public CompanyEmpWage(String company_name, int companyWage,
                              int numOfWorkingDays,int workingHrsPerMonth) {
            this.companyName=company_name;
            this.companyWage=companyWage;
            this.numOfWorkingDays=numOfWorkingDays;
            this.workingHrsPerMonth=workingHrsPerMonth;
        }

        public void present_absent() {
            for (int i = 0; i < 30; i++) {
                double  randomCheck = Math.floor(Math.random() * 10) % 3;
                switch ((int) randomCheck) {
                    case 0:
                        System.out.print("A-");
                        a_count++;
                        break;
                    case 1:
                        System.out.print("FT-");
                        ft_count++;
                        break;
                    case 2:
                        System.out.print("PT-");
                        pt_count++;
                        break;
                    default:
                        System.out.println("not  usable");
                }
                if (((ft_count + pt_count) >= numOfWorkingDays) ||
                        ((pt_count * 4 + ft_count * 8) >= workingHrsPerMonth)) {
                    break;
                }
            }
            System.out.println();
        }

        public void total_wage_calc() {
            total_wage_per_emp = (pt_count * Part_Time * companyWage) + (ft_count * Full_Time * companyWage);
            System.out.println("total absent days =" + a_count);
            System.out.println("total full time days =" + ft_count);
            System.out.println("total part time days =" + pt_count);
            System.out.println("total wage for the company: =" + total_wage_per_emp);
        }
    }


