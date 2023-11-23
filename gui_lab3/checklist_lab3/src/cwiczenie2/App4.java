package cwiczenie2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class App4 extends JFrame {
    private JLabel header;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JLabel nameField;
    private JLabel surnameField;
    private JLabel dateField;
    private JPanel JPanel2;
    private JLabel adressField;
    private JButton btnconfirm;
    private JButton saveExistingButton;
    private JLabel ageInfo;
    private JTextArea textArea1;
    private JPanel mainPanel;

    public static void main(String[] args) {
        App4 app = new App4();
        app.setVisible(true);

    }

    String name;
    String surname;
    Date dateofBirth;

    public App4() {
        this.setSize(600, 600);
        this.setContentPane(mainPanel);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


        btnconfirm.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                name = textField1.getText();
                surname = textField2.getText();
                textArea1.setText(name + " " + surname);
                String dateString = textField3.getText();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


                try {
                    Date date1 = sdf.parse(dateString);

                    long age = ChronoUnit.YEARS.between(date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), LocalDate.now());
                    ageInfo.setText("Wiek: " + age + " lat");
                    Person person = new Person(name, surname, date1, age);
                    textArea1.append(person.getName());
                    textArea1.append(" ");
                    textArea1.append(person.getSurname());
                    textArea1.append(" - Wiek: ");

                textArea1.append(" lat\n");

                } catch (ParseException ex) {
                    ex.printStackTrace();
                }


            }
        });
        saveExistingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
    }


    class Person {

        public String name;
        private String surname;
        private Date birthDate;
        private long age;

        public Person(String name, String surname, Date birthDate, long age) {
            this.name = name;
            this.surname = surname;
            this.birthDate = birthDate;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public Date getBirthDate() {
            return birthDate;
        }

        public long getAge() {
            return age;
        }
    }
}