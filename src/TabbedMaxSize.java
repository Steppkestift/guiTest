/**
 * Created by heiko-linke on 30.10.16.
 */
import java.awt.BorderLayout;
import javax.swing.*;

public class TabbedMaxSize {
    JTabbedPane tabbedPane;
    JPanel panelTab1;
    JPanel panelTab2;

    public TabbedMaxSize() {

        JPanel boxPanel1 = new JPanel();
        JPanel boxPanel2 = new JPanel();
        boxPanel1.setLayout(null);
        // add label to first bos
        Box box1 = Box.createVerticalBox();
        JLabel[] contrllabels= new JLabel[8];
        JTextField[] test = new JTextField[8];
        contrllabels[0] = new JLabel("SCF Type: ");
        contrllabels[1] = new JLabel("Units: ");
        contrllabels[2] = new JLabel("Spherical Harmonics: ");
        contrllabels[3] = new JLabel("Molecular Charge: ");
        contrllabels[4] = new JLabel("PP: ");
        contrllabels[5] = new JLabel("DFT Type: ");
        contrllabels[6] = new JLabel("Max Iterations: ");
        contrllabels[7] = new JLabel("Mult: ");
        test [1] = new JTextField("bla");
        int z = 0;
        for (int i = 1; i < 7; i++) {
            z = z + 10;
            contrllabels[i].setBounds(10,z,100,20);
            boxPanel1.add(contrllabels[i]);
        }

        // add labels to second box
        Box box2 = Box.createVerticalBox();
        for (int i = 1; i <= 100; i++) {
            box2.add(new JLabel("This is liste #" + i));
        }

        // add boxes to panels and to scroll panes

        boxPanel1.add(box1);
        boxPanel2.add(box2);
        JScrollPane panel1Scroll = new JScrollPane(boxPanel1);
        JScrollPane panel2Scroll = new JScrollPane(boxPanel2);

        // ser tabbed panels to BorderLayout and add scrolls
        panelTab1 = new JPanel(new BorderLayout());
        panelTab2 = new JPanel(new BorderLayout());
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

