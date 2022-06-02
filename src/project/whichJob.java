package project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class whichJob {
    private JFrame frame = new JFrame("Which job?!");
    private JButton b1 = new JButton("Display quizes");
    private JButton b2 = new JButton("Add new quiz");
    private JButton back = new JButton("<-");

    public whichJob(){
        b1.setBounds(300, 250, 200, 50);
        b2.setBounds(300, 400, 200, 50);
        back.setBounds(0, 715, 50, 50);

        b1.setFont(b1.getFont().deriveFont((float) 15));
        b2.setFont(b2.getFont().deriveFont((float) 15));

        frame.add(b1);
        frame.add(b2);
        frame.add(back);

        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Quizes f3 = new Quizes();
                frame.dispose(); // close window
                frame.setVisible(false); // hide window
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Addnew f3 = new Addnew();
                frame.dispose(); // close window
                frame.setVisible(false); // hide window
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login f2 = new login();
                frame.dispose(); // close window
                frame.setVisible(false); // hide window
            }
        });

    }
}
