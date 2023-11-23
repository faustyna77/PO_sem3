package lab2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Choice_App  extends JFrame {
    private JPanel panel;
    private JRadioButton button1;
    private JRadioButton button2;
    private JRadioButton button3;


    public void main (String [] args)
    {
        Choice_App app=new Choice_App();


    }
public Choice_App() {


        this.setSize(300,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);






    button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
    button2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });




    button3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });


}



}
