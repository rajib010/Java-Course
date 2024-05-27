//basic login form interface using java swing

import javax.swing.*;

public class LoginForm extends JFrame {

    //private variables should be outside the main function in java
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JPanel panel;

    public void initComponents() {
        panel = new JPanel();
        this.add(panel);
        panel.setLayout(null); // now we can define absolute position for each component

        //for username
        usernameLabel = new JLabel("Username: ");
        usernameLabel.setBounds(50, 50, 100, 30);
        panel.add(usernameLabel);
        usernameField = new JTextField(20);//columns
        usernameField.setBounds(200, 50, 200, 30);
        panel.add(usernameField);

        //for password
        passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(50, 100, 100, 30);
        panel.add(passwordLabel);
        passwordField = new JPasswordField(20);
        passwordField.setBounds(200, 100, 200, 30);
        panel.add(passwordField);

        //for button
        loginButton = new JButton("Login");
        loginButton.setBounds(100, 150, 75, 30);
        panel.add(loginButton);
    }

    //initialize a constructor
    public LoginForm() {
        initComponents();
        setTitle("Login Form");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}
