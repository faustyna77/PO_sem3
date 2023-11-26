package zadania_do_samodzielnego_rozw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Task1 extends JFrame {
    private JScrollBar scrollBar1;
    private JList list1;
    private JList list2;
    private JButton button4;
    private JButton button3;
    private JButton button2;
    private JButton button1;
    private JPanel mainpanel;

    public static void main(String[] args) {
        Task1 task = new Task1();
        task.setVisible(true);
    }

    public Task1() {
        this.setSize(500, 500);
        this.setContentPane(mainpanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Pobranie zaznaczonego elementu z list1
                Object selectedValue = list1.getSelectedValue();


                if (selectedValue != null) {
                    // Dodanie zaznaczonego elementu do list2
                    DefaultListModel list2Model = (DefaultListModel) list2.getModel();
                    list2Model.addElement(selectedValue);

                    // Usunięcie zaznaczonego elementu z list1
                    DefaultListModel list1Model = (DefaultListModel) list1.getModel();
                    list1Model.removeElement(selectedValue);
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Object selectedValue = list2.getSelectedValue();

                if (selectedValue != null) {
                    // Dodanie zaznaczonego elementu do list2
                    DefaultListModel list2Model = (DefaultListModel) list1.getModel();
                    list2Model.addElement(selectedValue);

                    // Usunięcie zaznaczonego elementu z list1
                    DefaultListModel list1Model = (DefaultListModel) list2.getModel();
                    list1Model.removeElement(selectedValue);
                }

            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Object secondselected=list1.getSelectionMode();
                DefaultListModel list1Model = (DefaultListModel) list1.getModel();
                DefaultListModel list2Model = (DefaultListModel) list2.getModel();
                for (int i = 0; i < list1Model.size(); i++) {
                    Object element = list1Model.getElementAt(i);
                    list2Model.addElement(element);
                }

                // Usunięcie wszystkich elementów z lewej
                list1Model.removeAllElements();
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                Object secondselected=list1.getSelectionMode();
                DefaultListModel list1Model = (DefaultListModel) list1.getModel();
                DefaultListModel list2Model = (DefaultListModel) list2.getModel();
                for (int i = 0; i < list2Model.size(); i++) {
                    Object element = list2Model.getElementAt(i);
                    list1Model.addElement(element);
                }

                // Usunięcie wszystkich elementów z lewej
                list2Model.removeAllElements();
            }
        });
    }
}




