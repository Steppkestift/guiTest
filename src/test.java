// import com.jgoodies.forms.layout.FormLayout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;

//import com.jgoodies.forms.factories.*;
//import com.jgoodies.forms.layout.*;
/*
 * Created by JFormDesigner on Sat Oct 15 22:46:34 CEST 2016
 */



/**
 * @author Heiko Linke
 */
public class test extends JFrame {
    public test() {
        initComponents();

    }

    private void menuItem1MenuDragMouseEntered(MenuDragMouseEvent e) {

        System.out.println("test");
    }

    private void button1ActionPerformed(ActionEvent e) {
        System.out.println("test2");
    }

    private void button3ActionPerformed(ActionEvent e) {
        System.out.println("test2");
    }

    private void initComponents() {

        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Heiko Linke
        frame1 = new JFrame();
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        textPane1 = new JTextPane();

        //======== frame1 ========
        {
            Container frame1ContentPane = frame1.getContentPane();
            frame1ContentPane.setLayout(new FlowLayout());

            //======== panel1 ========
            {

                // JFormDesigner evaluation mark
                panel1.setBorder(new javax.swing.border.CompoundBorder(
                    new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                        "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                        javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                        java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

                panel1.setLayout(new FlowLayout());
            }
            frame1ContentPane.add(panel1);

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(textPane1);
            }
            frame1ContentPane.add(scrollPane1);
            frame1.pack();
            frame1.setLocationRelativeTo(frame1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public static void main(String args[])
    {
        test t1 = new test();
        t1.initComponents();
        t1.setVisible(true);
        t1.pack();

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Heiko Linke
    private JFrame frame1;
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JTextPane textPane1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
