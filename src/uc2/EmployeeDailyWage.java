package uc2;

public class EmployeeDailyWage {
    public EmployeeDailyWage() {
    }

    public int dailywage(int full_day_hour, int wage_per_hour) {
        int daily_wage = full_day_hour * wage_per_hour;
        System.out.println("\n\t DAILY WAGE OF EMPLOYEE IS :: \t $" + daily_wage);
        return daily_wage;
    }
}
