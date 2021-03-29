package instance.Salary;
import java.text.NumberFormat;
import java.util.Scanner;

import instance.Salary.SalaryInstance;



public class SalaryCal {

    public static void main(String[] args) {

        final int PRINCIPAL_MIN = 1000;
        final int PRINCIPAL_MAX = 1_000_000;
        
        var salaryInstance = new SalaryInstance();
        

        int principal = (int) Console.readNumber("Principal: ", PRINCIPAL_MIN, PRINCIPAL_MAX);

        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);

        int years = (int) Console.readNumber("Period (Years): ", 1, 30);

        salaryInstance.printMortgage(principal, annualInterest, years);

        salaryInstance.printPaymentSchedule(principal, annualInterest, years);
    }

    
}
