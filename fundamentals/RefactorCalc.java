import java.util.Scanner;

public class RefactorCalc {
    public static void main(String[] args) {
        
        int princial = (int) readNumber("Principal", 10000, 1000000);
        float annualInterest = (float) readNumber("AnnualInterest: ", 1, 30);
        byte years = (byte) readNumber("Years: ", 1, 30);
        double result = calculateMortgage(princial, annualInterest, years);
        System.out.println("Mortage: " + result);

    }

    public static double readNumber( String prompt, double min, double max) {
        Scanner scan = new Scanner(System.in);
        double value = 0;
        while (true) {
            System.out.print(prompt + ": ");
            value = scan.nextDouble();
            if (value >= min && value <= max) {
                break;
            }
            System.out.println("Enter a value between " + min + "and " + max);
        }
        return value;
    }
    
    public static double calculateMortgage(
        int principal,
        float annualInterest,
            byte years) {
        final byte months = 12;
        final byte percent = 100;
        float monthlyInterest = annualInterest / percent / months;
        float numberOfPayments = years * monthlyInterest;
        double mortage = principal* ((monthlyInterest*Math.pow(1+ monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
        return mortage;
        }

}
