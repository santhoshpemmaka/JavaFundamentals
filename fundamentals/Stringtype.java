package fundamentals;
import java.util.Arrays;

public class Stringtype {
    public static void main(String[] args) {
        String message = "message";
        System.out.println(message.length());
        System.out.println(message.toUpperCase());
        System.out.println(message);
        System.out.println("c:\\Windows\\");
        int[] number = new int[5];
        int[][] number1 = new int[2][3];
        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.deepToString(number1));
        final float pi = 3.14F;
        System.out.println(pi);

    }
}
