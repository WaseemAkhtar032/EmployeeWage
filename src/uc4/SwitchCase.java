package uc4;

import uc1.EmployeePresentAbsent;
import uc2.EmployeeDailyWage;
import uc3.PartTimeEmployeeWage;
import uc5.EmployeeMonthlyWage;
import uc6.TotalWorkingHourMonthly;

import java.util.Scanner;

public class SwitchCase {
    public void switchCase() {
        int key;
        do {
            System.out.println("ENTER THE KEY VALUE ");
            Scanner sc = new Scanner(System.in);
            key = sc.nextInt();
            System.out.println("1.EmployeePresentAbsent \n 2.EmployeeDailyWage \n 3. PartTimeEmployeeWage \n 4.EmployeeMonthlyWage \n 5.Total WorkingHourMonthly \n 6.Exit ");
            switch (key) {
                case 1:
                    EmployeePresentAbsent w1 = new EmployeePresentAbsent();
                    w1.PresentAbsent();
                    break;
                case 2:
                    EmployeeDailyWage d1 = new EmployeeDailyWage();
                    d1.dailywage(8, 20);
                    break;
                case 3:
                    PartTimeEmployeeWage p1 = new PartTimeEmployeeWage();
                    p1.part_time_wage(4, 20);
                    break;
                case 4:
                    EmployeeMonthlyWage m1 = new EmployeeMonthlyWage();
                    m1.monthlywage(8, 20, 20);
                    break;
                case 5:
                    TotalWorkingHourMonthly t1 = new TotalWorkingHourMonthly();
                    t1.totalMonthly(98);
                case 6:
                    break;
                default:
                    System.out.println("INVALID KEY \n");
            }
        } while(key != 6);

    }
}
