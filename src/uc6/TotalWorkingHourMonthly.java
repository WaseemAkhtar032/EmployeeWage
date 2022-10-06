package uc6;

public class TotalWorkingHourMonthly {
    public void totalMonthly(int hours) {
        if (hours <= 100) {
            int total_wage = hours * 20;
            System.out.println("total monthly wage is :: $" + total_wage);
        } else {
            System.out.println("OOPS! the maximum value of working hour is 100 ");
        }

    }
}
