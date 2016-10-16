import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sat Oct 15 23:55:57 CEST 2016
 */



/**
 * @author Heiko Linke
 */
public class appGUI extends JFrame {
    public appGUI() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        System.out.println(true);
    }

    private void initComponents() {
        JButton button1;
        JCheckBox checkBox1;
        JPasswordField passwordField1;
        JScrollPane scrollPane1;
        JTextPane textPane1;


        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Heiko Linke
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Heiko Linke
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                appGUI GUI = new appGUI();
                GUI.setSize(800, 1000);
                GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                GUI.setVisible(true);
            }
        });
    }
}


