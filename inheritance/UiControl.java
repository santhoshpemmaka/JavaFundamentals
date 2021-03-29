package inheritance;

public class UiControl {

    private boolean isEnabled = true;

    // public UiControl(boolean isEnabled) {
    //     System.out.println("Ui control constructor");
    //     this.isEnabled = isEnabled;
    // }
    
    public void render() {
        System.out.println("Rendering in the ui control");
    }

    private final void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean getEnableStatus(){
        return isEnabled;
    }
    
}
