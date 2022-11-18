/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.settings;

import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextSettings {
    public static boolean isTextFieldFull(JPanel panel){
        Component[] components = panel.getComponents();
        for(Component c: components){
            if(c instanceof JTextField){
                JTextField textField = (JTextField)c;
                if(textField.getText().trim().equals("") && textField.isEnabled()){
                   return false ;
                }
            }
        }
        return true;
    }
}
