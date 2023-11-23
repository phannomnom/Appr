import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Main extends JFrame {
    private JTextField textField1;

    public Main(){
        setContentPane(MainPanel);
        setTitle("app");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,200);
        setLocationRelativeTo(null);
        setVisible(true);
        btnS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Desktop d=Desktop.getDesktop();

                String  url=textField1.getText();
                try {
                    d.browse(new URI(url));
                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (URISyntaxException ex) {
                    ex.printStackTrace();
                }

            }
        });
    }
    private JTextField Url;
    private JButton btnS;
    private JPanel MainPanel;

    public static void main(String[] args) {
        new Main();
    }
}
