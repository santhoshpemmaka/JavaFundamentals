package instance;

public class Instance {
    public static void main(String[] args) {
        
        TextBox testBox1 = new TextBox();
        testBox1.setText("Box 1");
        System.out.println(testBox1.text);

        TextBox testBox2 = new TextBox();
        testBox2.setText("Box 2");
        System.out.println(testBox2.text);

    }
}
