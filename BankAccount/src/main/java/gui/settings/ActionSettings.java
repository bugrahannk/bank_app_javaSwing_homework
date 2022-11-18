
package gui.settings;
import javax.swing.JFrame;


public class ActionSettings {
    public static void setVisible(JFrame currentFrame, JFrame nextFrame){
        currentFrame.setVisible(false);
        nextFrame.setVisible(true);
    }
}
