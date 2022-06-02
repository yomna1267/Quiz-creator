package project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Quizes{
    private JFrame frame = new JFrame("Quizes");
    private JButton b1 = new JButton("Delete");
    private JButton b2 = new JButton("Open");
    private JButton back = new JButton("<-");
    ArrayList<String> arrayList = new ArrayList<String>();
    private JComboBox cmb;

    public Quizes(){

        Connection con = jdbcConnection.getConnection();
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM my_db.quizes;");
            int i = 0;
            while(resultSet.next()){
                arrayList.add(resultSet.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String[] name = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++){
                name[i] = arrayList.get(i);
        }

        cmb = new JComboBox(name);
        cmb.setBounds(250,200, 300, 50 );
        b1.setBounds(100, 500, 200, 50);
        b2.setBounds(500, 500, 200, 50);
        back.setBounds(0, 715, 50, 50);

        b1.setFont(b1.getFont().deriveFont((float) 15));
        b2.setFont(b2.getFont().deriveFont((float) 15));
        cmb.setFont(cmb.getFont().deriveFont((float) 15));

        frame.add(b1);
        frame.add(b2);
        frame.add(back);
        frame.add(cmb);

        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = cmb.getSelectedItem().toString();
                try {
                    Statement statement = con.createStatement();
                    statement.executeUpdate("DELETE FROM my_db.quizes WHERE quizname = '"+value+"';");
                    frame.dispose(); // close window
                    frame.setVisible(false); // hide window
                    Quizes f3 = new Quizes();

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = cmb.getSelectedItem().toString();
                try {
                    Statement statement = con.createStatement();
                    quizDetails f3 = new quizDetails(value);
                    frame.dispose(); // close window
                    frame.setVisible(false); // hide window
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                whichJob f2 = new whichJob();
                frame.dispose(); // close window
                frame.setVisible(false); // hide window
            }
        });

    }
}
