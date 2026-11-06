import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements ActionListener {

    JFrame frame;
    JTextField tf;
    JTextArea ta;
    JButton send;
    JButton reset;
    String username;
    Main otherUser;

    Main(String name) {

        username = name;
        frame = new JFrame("Chat Application - " + username);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        JPanel panel = new JPanel();

        JLabel label = new JLabel("Enter Text");
        tf = new JTextField(10);
        send = new JButton("Send");
        reset = new JButton("Reset");

        panel.add(label);
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        ta = new JTextArea();

        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, ta);

        // Listen for button events
        send.addActionListener(this);
        reset.addActionListener(this);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == send) {
            String message = tf.getText();

            ta.append(username + ": " + message + "\n");

            if (otherUser != null) {
                otherUser.ta.append(username + ": " + message + "\n");
            }

            tf.setText("");
        }

        if (e.getSource() == reset) {
            ta.setText("");
            tf.setText("");
        }
    }

    public static void main(String args[]) {

    Main user1 = new Main("User 1");
    Main user2 = new Main("User 2");

    user1.otherUser = user2;
    user2.otherUser = user1;
    }
}