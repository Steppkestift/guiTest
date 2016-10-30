import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sun Oct 16 23:48:33 CEST 2016
 */



/**
 * @author Heiko Linke
 */
public class appGUITesttool extends JFrame {
    JButton testButton = new JButton("test");
    JTextField txtFeld = new JTextField("anzahl");

    public appGUITesttool() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menuItem1 = new JMenuItem();
        menu2 = new JMenu();
        tabbedPane1 = new JTabbedPane();
        scrollPane1 = new JScrollPane();
        list1 = new JList();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("Einstellungen");

                //---- menuItem1 ----
                menuItem1.setText("DB-Konfig");
                menu1.add(menuItem1);
            }
            menuBar1.add(menu1);

            //======== menu2 ========
            {
                menu2.setText("Testdaten");
            }
            menuBar1.add(menu2);
        }
        setJMenuBar(menuBar1);

        //======== tabbedPane1 ========
        {

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(list1);
            }
            tabbedPane1.addTab("Auswahl DB", scrollPane1);
        }
        contentPane.add(tabbedPane1);
        tabbedPane1.setBounds(5, 5, 370, 235);

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents



        testButton.addActionListener(new java.awt.event.ActionListener() {
            // Beim Drücken des Menüpunktes wird actionPerformed aufgerufen
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // Dateiauswahldialog wird erzeugt...
                JFrame   testFrame    = new JFrame("test");
                JButton  testButton   = new JButton("Klick");
                JTextField txtField1  = new JTextField("ClipRectangles");
                testFrame.setLayout(null);
             //   JButton test1 = new JButton("Klick");

                JLabel[] contrllabels= new JLabel[8];
                contrllabels[0] = new JLabel("SCF Type: ");
                contrllabels[1] = new JLabel("Units: ");
                contrllabels[2] = new JLabel("Spherical Harmonics: ");
                contrllabels[3] = new JLabel("Molecular Charge: ");
                contrllabels[4] = new JLabel("PP: ");
                contrllabels[5] = new JLabel("DFT Type: ");
                contrllabels[6] = new JLabel("Max Iterations: ");
                contrllabels[7] = new JLabel("Mult: ");
                testButton.setBounds(10,10,100,20);



                int y = 0;
                for(int i = 0;i<contrllabels.length;i++){
                    // c.gridy = i;
                    y = y + 10;
                    contrllabels[i].setBounds(50,y,200,20);
                    testFrame.add(contrllabels[i]);
                }

               // test1.setBounds(20,20,100,20);
               // testFrame.add(test1);
                testFrame.setLocation(100,100);
                testFrame.pack();
                testFrame.setVisible(true);
                testFrame.setSize(500,500);


            }
        });
    }



    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem menuItem1;
    private JMenu menu2;
    private JTabbedPane tabbedPane1;
    private JScrollPane scrollPane1;
    private JList list1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                appGUITesttool GUI = new appGUITesttool();
                GUI.setSize(800, 800);
                GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                GUI.setVisible(true);
            }
        });
    }

}
