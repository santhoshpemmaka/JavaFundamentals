package inheritance;

import java.util.ResourceBundle.Control;

public class Inheritance {
    
    public static void main(String[] args) {
        // var control = new TextBox(true);
        // System.out.println(control.getEnableStatus());
        // System.out.println(control.toString());

        UiControl[] controls = { new TextBox(), new Checkbox() , new UiControl() };
        for (var control : controls) {
            control.render();
        }
    }
}
