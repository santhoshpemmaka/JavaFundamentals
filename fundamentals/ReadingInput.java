package fundamentals;
import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        System.out.println("Enter the name:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        // byte age = scan.nextByte();
        System.out.println(name.trim());
    }
}
