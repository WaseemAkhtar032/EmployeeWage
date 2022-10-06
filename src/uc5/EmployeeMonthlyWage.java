package uc5;

import uc2.EmployeeDailyWage;

public class EmployeeMonthlyWage {
    public void monthlywage(int daily_hour, int wage_per_hour, int monthly_days) {
        EmployeeDailyWage w1 = new EmployeeDailyWage();
        int daily_wage = w1.dailywage(daily_hour, wage_per_hour);
        int monthly_wage = daily_wage * monthly_days;
        System.out.println("\n\t MONTHLY WAGE OF EMPLOYEE IS :: \t $" + monthly_wage);
    }
}
