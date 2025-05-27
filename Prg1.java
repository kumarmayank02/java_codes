import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Prg1 extends JFrame implements ActionListener {
    JLabel l1, l2;
    JTextField t1;
    JButton b1, b2;

    Prg1() {
        super("Greater Numbers");

        l1 = new JLabel("Enter any number:");
        l2 = new JLabel();
        t1 = new JTextField();
        b1 = new JButton("Show");
        b2 = new JButton("Exit");

        setLayout(null);

        l1.setBounds(50, 30, 150, 25);
        t1.setBounds(200, 30, 125, 25);
        l2.setBounds(50, 80, 300, 25);
        b1.setBounds(50, 130, 100, 30);
        b2.setBounds(160, 130, 100, 30);

        add(l1);
        add(t1);
        add(l2);
        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            int n = Integer.parseInt(t1.getText()); // no try-catch
            int g1 = n + 1;
            int g2 = n + 2;
            int g3 = n + 3;
            l2.setText("3 greater numbers: " + g1 + ", " + g2 + ", " + g3);
        } else if (ae.getSource() == b2) {
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        new Prg1();
    }
}
