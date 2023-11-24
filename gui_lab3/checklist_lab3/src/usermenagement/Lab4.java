package usermenagement;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab4 extends JFrame {
    private JPanel mainPanel;
    private JTree tree1;
    private JTree tree2;
    private JButton OKButton;
    private JButton anulujButton;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel label1;
    private JLabel label2;


    public static void main(String[] args) {
        Lab4 lab = new Lab4();
        lab.setVisible(true);
    }


    public Lab4() {
        super("Aplikacja dla laboratoriów 4 ");
        this.setSize(600, 600);
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Moje kursy");
        DefaultMutableTreeNode colorsNode = new DefaultMutableTreeNode("Programowanie");
        colorsNode.add(new DefaultMutableTreeNode("C#"));

        colorsNode.add(new DefaultMutableTreeNode("Java"));
        colorsNode.add(new DefaultMutableTreeNode("Python"));

        root.add(colorsNode);

        // Set the root for tree1 (assuming tree1 was defined in your .form file)
        tree1.setModel(new DefaultTreeModel(root));




        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                TreePath selectionPath = tree1.getSelectionPath();

                // Sprawdzenie, czy coś jest zaznaczone
                if (selectionPath != null) {
                    // Pobranie ostatniego elementu w ścieżce (czyli zaznaczonego węzła)
                    DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) selectionPath.getLastPathComponent();

                    // Sprawdzenie, czy zaznaczony węzeł to "C#"
                    if (selectedNode.toString().equals("C#")) {
                        textField3.setText("Wybrałeś C#");
                        textField2.setText("2400 zł");

                    } else if (selectedNode.toString().equals("Java")) {
                        textField3.setText("Java");
                        textField2.setText("3000 zł");
                    } else if (selectedNode.toString().equals("Python")) {
                        textField3.setText("Python");
                        textField2.setText("4000 zł");
                    }
                }
                String additionalData = JOptionPane.showInputDialog(Lab4.this, "Wprowadź swoje dane osobowe:");
            }
        });
        anulujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}

