package uc3;

public class PartTimeEmployeeWage {
    public PartTimeEmployeeWage() {
    }

    public int part_time_wage(int part_time_hour, int wage_per_hour) {
        int daily_wage = part_time_hour * wage_per_hour;
        System.out.println("\n\t DAILY WAGE OF PART TIME EMPLOYEE IS :: \t $" + daily_wage);
        return daily_wage;
    }
}
