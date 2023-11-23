package laboratoria_nr2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kursy extends JFrame {
    private JPanel mainPanel;
    private JCheckBox java;
    private JCheckBox python;
    private JCheckBox react;
    private JCheckBox rust;
    private JTextField textField1;
    private JLabel javaprice;
    private JLabel reactprice;
    private JLabel pythonprice;
    private JLabel rustprice;
    private JButton OKButton;
    private JPanel secondContent;
    private JPanel thirdContent;
    private JPanel asside;

    private int javaPrice = 100;  // Cena za kurs Java
    private int pythonPrice = 80; // Cena za kurs Python
    private int reactPrice = 120; // Cena za kurs React
    private int rustPrice = 90;   // Cena za kurs Rust
    public static void main(String[] args) {
        Kursy kursy = new Kursy();
        kursy.setVisible(true);
    }

    public Kursy() {
        this.setSize(800, 600);
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainPanel.setBackground(Color.CYAN);
        OKButton.setBackground(Color.ORANGE);
        thirdContent.setBackground(Color.green);
        asside.setBackground(Color.CYAN);


        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int total = 0;

                if (java.isSelected()) {
                    total += javaPrice;
                }
                if (python.isSelected()) {
                    total += pythonPrice;
                }
                if (react.isSelected()) {
                    total += reactPrice;
                }
                if (rust.isSelected()) {
                    total += rustPrice;
                }

                textField1.setText("Łączna wartość zamówienia: " + total + " zł");
                JOptionPane.showMessageDialog(Kursy.this, "Łączna wartość zamówienia: " + total + " zł", "Wartość zamówienia", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
