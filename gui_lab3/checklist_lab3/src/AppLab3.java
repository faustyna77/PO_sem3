import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppLab3 extends JFrame{
    private JPanel mainPanel;
    private JComboBox choice;
    private JButton btn;
    private JLabel textPanel;


    public static void main(String [] args)
    {
        AppLab3 app=new AppLab3();
        app.setVisible(true);
    }


    public AppLab3()
    {

        super("Aplikacja do wyboru języka programowaia");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(700,700);


        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedOption = (String) choice.getSelectedItem();
                textPanel.setText("wybrana opcja to "+ selectedOption);
                JOptionPane.showMessageDialog(AppLab3.this, "Wybrana opcja: " + selectedOption);

            }
        });
    }


}
