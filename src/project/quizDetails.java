package project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class quizDetails {

    JFrame frame = new JFrame("Quiz Details");

    private JLabel qname = new JLabel("Quiz Name:");

    private JLabel q1 = new JLabel("Q1:");
    private JLabel q2 = new JLabel("Q2:");
    private JLabel q3 = new JLabel("Q3:");

    private JLabel q1a = new JLabel("a:");
    private JLabel q1b = new JLabel("b:");
    private JLabel q1c = new JLabel("c:");

    private JLabel q2a = new JLabel("a:");
    private JLabel q2b = new JLabel("b:");
    private JLabel q2c = new JLabel("c:");

    private JLabel q3a = new JLabel("a:");
    private JLabel q3b = new JLabel("b:");
    private JLabel q3c = new JLabel("c:");

    private JButton save = new JButton(" Save ");
    private JButton back = new JButton("<-");

    private JTextArea qnameArea = new JTextArea();

    private JTextArea areaq1 = new JTextArea();
    private JTextArea areaq2 = new JTextArea();
    private JTextArea areaq3 = new JTextArea();

    private JTextArea areaq1a = new JTextArea();
    private JTextArea areaq1b = new JTextArea();
    private JTextArea areaq1c = new JTextArea();

    private JTextArea areaq2a = new JTextArea();
    private JTextArea areaq2b = new JTextArea();
    private JTextArea areaq2c = new JTextArea();

    private JTextArea areaq3a = new JTextArea();
    private JTextArea areaq3b = new JTextArea();
    private JTextArea areaq3c = new JTextArea();



    public quizDetails(String value) {

        qname.setBounds(50,75,200, 25);
        qnameArea.setBounds(150, 75, 200,30);

        q1.setBounds(50,150,70,25);
        areaq1.setBounds(150, 150, 600, 30);
        q1a.setBounds(125, 190, 25, 30);
        q1b.setBounds(125, 225, 25, 30);
        q1c.setBounds(125, 260, 25, 30);
        areaq1a.setBounds(150, 190, 200, 30);
        areaq1b.setBounds(150, 225, 200, 30);
        areaq1c.setBounds(150, 260, 200, 30);


        q2.setBounds(50,300,70,25);
        areaq2.setBounds(150, 300, 600, 30);
        q2a.setBounds(125, 340, 25, 30);
        q2b.setBounds(125, 375, 25, 30);
        q2c.setBounds(125, 410, 25, 30);
        areaq2a.setBounds(150, 340, 200, 30);
        areaq2b.setBounds(150, 375, 200, 30);
        areaq2c.setBounds(150, 410, 200, 30);

        q3.setBounds(50,450,70,25);
        areaq3.setBounds(150, 450, 600, 30);
        q3a.setBounds(125, 490, 25, 30);
        q3b.setBounds(125, 525, 25, 30);
        q3c.setBounds(125, 560, 25, 30);
        areaq3a.setBounds(150, 490, 200, 30);
        areaq3b.setBounds(150, 525, 200, 30);
        areaq3c.setBounds(150, 560, 200, 30);

        save.setBounds(300, 650, 200, 50);
        back.setBounds(0, 715, 50, 50);


        frame.add(qname);
        frame.add(qnameArea);

        frame.add(q1);
        frame.add(q2);
        frame.add(q3);

        frame.add(save);
        frame.add(back);

        frame.add(areaq1);
        frame.add(areaq1a);
        frame.add(areaq1b);
        frame.add(areaq1c);
        frame.add(q1a);
        frame.add(q1b);
        frame.add(q1c);

        frame.add(areaq2);
        frame.add(areaq2a);
        frame.add(areaq2b);
        frame.add(areaq2c);
        frame.add(q2a);
        frame.add(q2b);
        frame.add(q2c);

        frame.add(areaq3);
        frame.add(areaq3a);
        frame.add(areaq3b);
        frame.add(areaq3c);
        frame.add(q3a);
        frame.add(q3b);
        frame.add(q3c);


        save.setFont(save.getFont().deriveFont((float) 15));
        qname.setFont(qname.getFont().deriveFont((float) 15));

        q1.setFont(q1.getFont().deriveFont((float) 15));
        q1a.setFont(q1a.getFont().deriveFont((float) 15));
        q1b.setFont(q1b.getFont().deriveFont((float) 15));
        q1c.setFont(q1c.getFont().deriveFont((float) 15));
        areaq1.setFont(areaq1.getFont().deriveFont((float) 15));
        areaq1a.setFont(areaq1a.getFont().deriveFont((float) 15));
        areaq1b.setFont(areaq1b.getFont().deriveFont((float) 15));
        areaq1c.setFont(areaq1c.getFont().deriveFont((float) 15));

        q2.setFont(q2.getFont().deriveFont((float) 15));
        areaq2.setFont(areaq2.getFont().deriveFont((float) 15));
        q2a.setFont(q2a.getFont().deriveFont((float) 15));
        q2b.setFont(q2b.getFont().deriveFont((float) 15));
        q2c.setFont(q2c.getFont().deriveFont((float) 15));
        areaq2a.setFont(areaq2.getFont().deriveFont((float) 15));
        areaq2b.setFont(areaq2b.getFont().deriveFont((float) 15));
        areaq2c.setFont(areaq2c.getFont().deriveFont((float) 15));

        q3.setFont(q3.getFont().deriveFont((float) 15));
        areaq3.setFont(areaq3.getFont().deriveFont((float) 15));
        q3a.setFont(q3a.getFont().deriveFont((float) 15));
        q3b.setFont(q3b.getFont().deriveFont((float) 15));
        q3c.setFont(q3c.getFont().deriveFont((float) 15));
        areaq3a.setFont(areaq3a.getFont().deriveFont((float) 15));
        areaq3b.setFont(areaq3b.getFont().deriveFont((float) 15));
        areaq3c.setFont(areaq3c.getFont().deriveFont((float) 15));


        qnameArea.setFont(qnameArea.getFont().deriveFont((float) 15));

        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        Connection con = jdbcConnection.getConnection();
        qnameArea.setText(value);
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet =  statement.executeQuery("SELECT * FROM my_db.questions WHERE quizname = '"+value+"';");
            while (resultSet.next()){
               areaq1.setText(resultSet.getString(3));
               areaq2.setText(resultSet.getString(4));
               areaq3.setText(resultSet.getString(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet =  statement.executeQuery("SELECT * FROM my_db.question1 WHERE q1 = '"+areaq1.getText()+"';");
            while (resultSet.next()){
                areaq1a.setText(resultSet.getString(3));
                areaq1b.setText(resultSet.getString(4));
                areaq1c.setText(resultSet.getString(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet =  statement.executeQuery("SELECT * FROM my_db.question2 WHERE q2 = '"+areaq2.getText()+"';");
            while (resultSet.next()){
                areaq2a.setText(resultSet.getString(3));
                areaq2b.setText(resultSet.getString(4));
                areaq2c.setText(resultSet.getString(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet =  statement.executeQuery("SELECT * FROM my_db.question3 WHERE q3 = '"+areaq3.getText()+"';");
            while (resultSet.next()){
                areaq3a.setText(resultSet.getString(3));
                areaq3b.setText(resultSet.getString(4));
                areaq3c.setText(resultSet.getString(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Statement statement = con.createStatement();
                    statement.executeUpdate("DELETE FROM my_db.quizes WHERE quizname = '"+value+"';");
                    statement.executeUpdate("INSERT INTO my_db.quizes(quizname) VALUES ('"+qnameArea.getText()+"');");
                    statement.executeUpdate("INSERT INTO my_db.questions(quizname, q1, q2, q3) VALUES ('"+qnameArea.getText()+"','"+areaq1.getText()+"', '"+areaq2.getText()+"', '"+areaq3.getText()+"' );");
                    statement.executeUpdate("INSERT INTO my_db.question1(q1, a, b, c) VALUES ('"+areaq1.getText()+"','"+areaq1a.getText()+"', '"+areaq1b.getText()+"', '"+areaq1c.getText()+"' );");
                    statement.executeUpdate("INSERT INTO my_db.question2(q2, a, b, c) VALUES ('"+areaq2.getText()+"','"+areaq2a.getText()+"', '"+areaq2b.getText()+"', '"+areaq2c.getText()+"' );");
                    statement.executeUpdate("INSERT INTO my_db.question3(q3, a, b, c) VALUES ('"+areaq3.getText()+"','"+areaq3a.getText()+"', '"+areaq3b.getText()+"', '"+areaq3c.getText()+"' );");
                    frame.dispose(); // close window
                    frame.setVisible(false); // hide window
                    Quizes f2 = new Quizes();

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Quizes f2 = new Quizes();
                frame.dispose(); // close window
                frame.setVisible(false); // hide window
            }
        });

    }
}
