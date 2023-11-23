package laboratoria_nr2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui2 extends JFrame {
    private JPanel panel;
    private JPanel header;
    private JLabel label1;
    private JLabel label2;
    private JTextField loginField;
    private JPasswordField passwordField1;
    private JLabel outtext;
    private JButton btn;


    public  static void main(String[] args)
    {
        Gui2 gui=new Gui2();
        gui.setVisible(true);
    }

    public Gui2()
    {

        super("Aplikacja java v2");
        this.setSize(600,600);
        this.setContentPane(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String loginContent=loginField.getText();
                char [] passwordContent=passwordField1.getPassword();
                String pass=new String(passwordContent);
                outtext.setText(loginContent+" "+pass);



            }
        });
    }



}
