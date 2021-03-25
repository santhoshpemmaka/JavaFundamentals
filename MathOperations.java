import java.text.NumberFormat;

public class MathOperations {
    public static void main(String[] args) {
        double result = Math.round(1.1);
        int num = (int) Math.ceil(1.1);
        int num1 = (int) Math.floor(1.1F);
        System.out.println(num1);
        System.out.println(result);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result1 = currency.format(123445);
        System.out.println(result1);
        
    }
}
