package project;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class login extends JFrame {

    JFrame frame = new JFrame(" login");
    private JButton b;
    private JTextField txt1;
    private JTextField txt2;
    private JLabel lbl1;
    private JLabel lbl2;

    public login (){


       b = new JButton("Log in");
       lbl1 = new JLabel("User name");
       lbl2 = new JLabel("Password");
       txt1 = new JTextField();
       txt2 = new JTextField();


       b.setBounds(300, 600, 200, 50);
       lbl1.setBounds(50, 200, 200, 50);
       lbl2.setBounds(50, 400, 200, 50);
       txt1.setBounds(300, 200, 250, 50);
       txt2.setBounds(300, 400, 250, 50);

        lbl1.setFont(lbl1.getFont().deriveFont((float) 15));
        lbl2.setFont(lbl2.getFont().deriveFont((float) 15));
        txt1.setFont(txt1.getFont().deriveFont((float) 15));
        txt2.setFont(txt2.getFont().deriveFont((float) 15));
        b.setFont(b.getFont().deriveFont((float) 15));

        frame.add(b);
        frame.add(txt1);
        frame.add(txt2);
        frame.add(lbl1);
        frame.add(lbl2);


        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Connection con = jdbcConnection.getConnection();
                try {

                    Statement statement = con.createStatement();
                   ResultSet resultSet =  statement.executeQuery("SELECT * FROM my_db.login;");
                   String user = null;
                   String pass = null ;
                   while(resultSet.next()){
                        user = resultSet.getString(2);
                        pass = resultSet.getString(3);
                   }

                   if(user.equals(txt1.getText())&& (pass.equals(txt2.getText()))){
                       whichJob f2 = new whichJob();
                       frame.dispose(); // close window
                       frame.setVisible(false); // hide window
                   }
                }
                catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
    }
}
