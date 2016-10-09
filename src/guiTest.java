// GUI
import javax.swing.*;
import java.awt.event.*;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


//MongoDB

public class guiTest extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textField1;

    //mongo configuration
    //db integration


    public guiTest() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        try {
            String xmldata;
            MongoClient mongoClient = new MongoClient("localhost", 27017);
            DB db = mongoClient.getDB("xmlData");
            System.out.println("Connect to database successfully");
            DBCollection coll = db.getCollection("xmldatenBasis");
            System.out.println("Collection selected successfully");



            // DBObject query = new BasicDBObject("id","1").append("id","1");
            BasicDBObject b1 = new BasicDBObject();
            DBObject query = new BasicDBObject("name", "zen").append("speed",
                    new BasicDBObject("$gt", 30));
            query.put("id", "1");
            BasicDBObject fields = new BasicDBObject("id", 2);
            DBCursor cur = coll.find(new BasicDBObject("id", 1));

            DBObject doc = coll.findOne(query);
            System.out.println((String) cur.one().get("xmldata"));
            xmldata = (String) cur.one().get("xmldata");
            try {
                Files.write(Paths.get("test.xml"), xmldata.getBytes("UTF-8"));

            } catch (IOException e) {
                e.printStackTrace();
            }



        guiTest dialog = new guiTest();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    } catch(
    Exception e)

    {
        System.err.println(e.getClass().getName() + ": " + e.getMessage());
    }
  }
}