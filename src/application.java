import javax.swing.*;

/**
 * Created by heiko-linke on 15.10.16.
 */
public class application {
    private JTextArea textArea1;
    private JPanel panel1;
    private JTextField textField1;

    public static void main(String[] args)
    {
        /* Erzeugung eines neuen Frames mit dem
           Titel "Beispiel JFrame " */
        JFrame meinFrame = new JFrame("Beispiel JFrame");
        /* Wir setzen die Breite und die Höhe
           unseres Fensters auf 200 Pixel */
        meinFrame.setSize(200,200);
        // Wir lassen unseren Frame anzeigen
        meinFrame.setVisible(true);
    }


}
