package uc1;

public class EmployeePresentAbsent {
    public void PresentAbsent() {
        int present = 1;
        double check = Math.floor(Math.random() * 10.0) % 2.0;
        if (check == (double)present) {
            System.out.println("\n\t employee present \n ");
        } else {
            System.out.println("\n\temployee absent \n");
        }
    }
}
