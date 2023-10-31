import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    private JPanel JPnel1;
    private JButton exit;
    private JEditorPane firstNumber;
    private JButton addBtn;
    private JEditorPane secondNumber;
    private JEditorPane result;
    private JTextPane textPane1;
    private JButton roznica;

    public static void main(String args[])
      {
          App App=new App();
          App.setVisible(true);


      }

      public App()

      {
          super("okno ");
          this.setContentPane(JPnel1);
          this.pack();
          this.setDefaultCloseOperation(EXIT_ON_CLOSE);
          exit.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                dispose();
              }
          });
          addBtn.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  String firstNumberText=firstNumber.getText();
                  String secondNumberText=secondNumber.getText();
                  int suma=Integer.parseInt(firstNumberText)+Integer.parseInt(secondNumberText);
                  result.setText(Integer.toString(suma));


              }
          });
          roznica.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  int roznica=Integer.parseInt(firstNumber.getText())-Integer.parseInt(secondNumber.getText());
                  result.setText(Integer.toString(roznica));
              }
          });
      }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
