package fundamentals;
import java.text.NumberFormat;
import java.util.Scanner;

public class FirstExcerise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Principal:");
        int principal= scan.nextInt();
        System.out.print("Annual Interest Rate:");
        float interest = scan.nextFloat();
        interest = interest / 100 /12;
        System.out.print("Period (Years):");
        int year = scan.nextInt();
        double result = Math.pow(1 + interest, year);
        double amount = principal * result / result - 1;
        System.out.print("Mortagage: ");
        System.out.print(amount);

    }
}
