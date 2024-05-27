import java.awt.*;
import javax.swing.*;

public class LoginForm extends JFrame{

    //private variables should be outside the main function in java
    private Container container;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel messageLabel;

    //initialize a constructor
    public LoginForm(){
        setTitle("Login Form");
        
    }
    public static void main(String[] args){
        
        new LoginForm();
    }
}