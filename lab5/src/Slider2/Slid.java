package Slider2;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Slid extends JFrame{
    private JPanel mainpanel;
    private JSlider slider1;
    private JLabel labeltext;


    public  static void main(String [] args)
    {
        Slid slid=new Slid();
        slid.setVisible(true);
    }
public Slid() {

        super("Slider aplication");
        this.setContentPane(mainpanel);
        this.setSize(500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    slider1.setMinorTickSpacing(2);
    slider1.setMajorTickSpacing(10);
    slider1.setPaintTicks(true);
    slider1.setPaintLabels(true);

    slider1.addComponentListener(new ComponentAdapter() {
        @Override
        public void componentHidden(ComponentEvent e) {
            super.componentHidden(e);
            int text=slider1.getValue();
            String text2=Integer.toString(text);
            labeltext.setText(text2);
        }


    });
}
}
