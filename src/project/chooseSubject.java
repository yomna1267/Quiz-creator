package project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class chooseSubject {

    private JFrame frame = new JFrame(" Choose Subject");
    private String Subjects[] = { "Math", "JAVA"};
    private JComboBox cmb = new JComboBox(Subjects);
    private JButton b = new JButton("OK");

    public  chooseSubject(){

        cmb.setBounds(150,150, 100, 25 );
        b.setBounds(150, 250, 100, 25);

        frame.add(cmb);
        frame.add(b);

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Connection con = jdbcConnection.getConnection();
                String value= cmb.getSelectedItem().toString();
                System.out.println(value);
                try (Statement statement = con.createStatement()) {
                    frame.dispose(); // close window
                    frame.setVisible(false); // hide window
                    whichJob f3 = new whichJob();
                }
                catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
    }
}
