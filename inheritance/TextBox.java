package inheritance;

public class TextBox extends UiControl {
    private String text = "TextBox";

    // public TextBox(boolean enable) {
    //     System.out.println("Textbox constructor");
    // }

    public void render() {
        System.out.println("Rendering in the textbox");
    }

    public void clear() {
        System.out.println("Inheitance taken place");
    }
    
   

    @Override
    public String toString() {
        return text;
    }

}
