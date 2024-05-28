    //basic login form interface using java swing

    import javax.swing.*;
    import java.awt.event.*;

    public class LoginForm extends JFrame implements ActionListener {

        //private variables should be outside the main function in java
        private JLabel usernameLabel;
        private JLabel passwordLabel;
        private JTextField usernameField;
        private JPasswordField passwordField;
        private JButton loginButton;
        private JPanel panel;
        private JRadioButton adminType, userType;
        private ButtonGroup usertypeGroup;

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


            //type of user
            adminType = new JRadioButton("Admin");
            adminType.setBounds(50,150,100,30);
            panel.add(adminType);

            userType = new JRadioButton("User");
            userType.setBounds(200,150,100,30);
            panel.add(userType);

            //group the buttons
            usertypeGroup = new ButtonGroup();
            usertypeGroup.add(adminType);
            usertypeGroup.add(userType);


            //for button
            loginButton = new JButton("Login");
            loginButton.setBounds(100, 200, 75, 30);
            panel.add(loginButton);


            //add action listener to the login button
            loginButton.addActionListener(this);

        }

        //initialize a constructor
        public LoginForm() {
            initComponents();
            setTitle("Login Form");
            setSize(400, 400);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
        }

        public void actionPerformed(ActionEvent e){
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            String userType = adminType.isSelected()?"admin":"user";

            //display the variables as per requirement
            System.out.println("Username: "+username);
            System.out.println("Password: "+password);
            System.out.println("User Type: "+userType);


            //clear the input fields
            usernameField.setText("");
            passwordField.setText("");
            usertypeGroup.clearSelection();
        }

        public static void main(String[] args) {
            new LoginForm();
        }
    }
