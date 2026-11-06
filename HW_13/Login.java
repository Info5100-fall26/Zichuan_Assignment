import javax.swing.*;
import java.awt.event.*;

public class Login implements ActionListener {

    JFrame frame;
    JTextField username;
    JPasswordField password;
    JButton signup;
    JButton login;

    String savedUsername = "";
    String savedPassword = "";

    Login() {

        frame = new JFrame("Sign Up and Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 250);

        JPanel panel = new JPanel();

        JLabel userLabel = new JLabel("Username:");
        username = new JTextField(15);

        JLabel passLabel = new JLabel("Password:");
        password = new JPasswordField(15);

        signup = new JButton("Sign Up");
        login = new JButton("Login");

        panel.add(userLabel);
        panel.add(username);
        panel.add(passLabel);
        panel.add(password);
        panel.add(signup);
        panel.add(login);

        frame.getContentPane().add(panel);

        signup.addActionListener(this);
        login.addActionListener(this);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String user = username.getText();
        String pass = new String(password.getPassword());

        if (e.getSource() == signup) {

            if (!user.equals("") && !pass.equals("")) {

                savedUsername = user;
                savedPassword = pass;

                JOptionPane.showMessageDialog(
                    frame,
                    "Sign Up Successful!",
                    "Sign Up",
                    JOptionPane.PLAIN_MESSAGE
                );

            } else {

                JOptionPane.showMessageDialog(
                    frame,
                    "Please enter a username and password.",
                    "Sign Up Failed",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        }

        if (e.getSource() == login) {

            if (user.equals(savedUsername) &&
                pass.equals(savedPassword) &&
                !user.equals("")) {

                JOptionPane.showMessageDialog(
                    frame,
                    "Login Successful!",
                    "Login",
                    JOptionPane.PLAIN_MESSAGE
                );

                Main user1 = new Main("User 1");
                Main user2 = new Main("User 2");

                user1.otherUser = user2;
                user2.otherUser = user1;

                frame.dispose();

            } else {

                JOptionPane.showMessageDialog(
                    frame,
                    "Invalid Username or Password!",
                    "Login Failed",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }

    public static void main(String args[]) {
        new Login();
    }
}