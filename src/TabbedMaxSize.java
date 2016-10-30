/**
 * Created by heiko-linke on 30.10.16.
 */
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.*;

public class TabbedMaxSize {
    JTabbedPane tabbedPane;
    JPanel panelTab1;
    JPanel panelTab2;

    public TabbedMaxSize() {

        JPanel boxPanel1 = new JPanel();
        JPanel boxPanel2 = new JPanel();
        JPanel boxPanel3 = new JPanel();
        boxPanel1.setLayout(null);
        boxPanel3.setLayout(null);
        // add label to first bos
        //Box box1 = Box.createVerticalBox();
        JLabel hallo = new JLabel("huhudssdsdsdsdsd");
        JTextField clipRect = new JTextField("10");
        JLabel[] contrllabels= new JLabel[8];
        JTextField[] test = new JTextField[1000];
        JButton button = new JButton("Klick");
        contrllabels[0] = new JLabel("SCF Type: ");
        test[0] = new JTextField("test 1");
        contrllabels[1] = new JLabel("Units: ");
        contrllabels[2] = new JLabel("Spherical Harmonics: ");
        contrllabels[3] = new JLabel("Molecular Charge: ");
        contrllabels[4] = new JLabel("PP: ");
        contrllabels[5] = new JLabel("DFT Type: ");
        contrllabels[6] = new JLabel("Max Iterations: ");
        contrllabels[7] = new JLabel("Mult: ");

        test [1] = new JTextField("bla");
        test [2] = new JTextField("bla");
        test [3] = new JTextField("bla");
        test [4] = new JTextField("bla");
        test [5] = new JTextField("bla");
        test [6] = new JTextField("bla");
        test [7] = new JTextField("bla");

     //   int z = 0;
     //   for (int i = 1; i < 7; i++) {
     //       z = z + 40;
     //       test[i].setBounds(130,z,100,20);
     //       contrllabels[i].setBounds(10,z,100,20);
     //       boxPanel1.add(contrllabels[i]);
     //       boxPanel1.add(test[i]);
     //   }

        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e)
            {
               // JPanel boxPanel1 = new JPanel();
                boxPanel1.removeAll();
                boxPanel1.repaint();
                int z = 0;
                Integer anzahl = Integer.parseInt(clipRect.getText());
                for (int i = 1; i <= anzahl; i++)
                {
                    test[i] = new JTextField("txt");
                    z = z + 40;
                    test[i].setBounds(130,z,100,20);
                 //   contrllabels[i].setBounds(10,z,100,20);
                 //   boxPanel1.add(contrllabels[i]);
                    boxPanel1.add(test[i]);


                }
                System.out.println("test");
            }
        });
        // add labels to second box
        Box box2 = Box.createVerticalBox();
        for (int i = 1; i <= 100; i++) {
            box2.add(new JLabel("This is liste #" + i));
        }

        // add boxes to panels and to scroll panes
        hallo.setText("cliprectangles");
        hallo.setBounds(1,110,100,20);
        clipRect.setBounds(150,120,100,20);
        boxPanel1.setBounds(80,80,500,500);
        boxPanel1.setAutoscrolls(true);
        boxPanel1.setPreferredSize(new Dimension (400,400));
        button.setBounds(270,120,100,20);
       // boxPanel3.setBounds(10,10,100,100);
        // boxPanel3.add(hallo);
        boxPanel2.add(box2);
        JScrollPane panel1Scroll = new JScrollPane(boxPanel1);
        JScrollPane panel2Scroll = new JScrollPane(boxPanel2);



        panel1Scroll.createVerticalScrollBar();
        panel1Scroll.setBounds(10,170,300,300);
        panel2Scroll.setBounds(70,70,300,300);

        // ser tabbed panels to BorderLayout and add scrolls
        panelTab1 = new JPanel(null);
        panelTab2 = new JPanel(null);
       // panelTab1.add(boxPanel3);
        panelTab1.add(hallo);
        panelTab1.add(clipRect);
        panelTab1.add(button);
        panelTab1.add(panel1Scroll);
        panelTab2.add(panel2Scroll);


        // add panelTabs to tabbed pane
        tabbedPane = new JTabbedPane();
        tabbedPane.add(panelTab1, "Panel 1");
        tabbedPane.add(panelTab2, "Panel 2");


        JFrame frame = new JFrame();
        frame.add(tabbedPane);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                TabbedMaxSize gui = new TabbedMaxSize();
            }
        });
    }
}

