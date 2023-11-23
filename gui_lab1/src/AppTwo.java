import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class AppTwo extends JFrame{
    private JButton btn;
    private JPanel Panel;


    public static void main(String [] args)
    {
        AppTwo apptwo=new AppTwo();
        apptwo.setVisible(true);
    }
public AppTwo() {


    super("okno ");
    this.setContentPane(Panel);
    this.pack();
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    btn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,new Date());

        }
    });
}
}
