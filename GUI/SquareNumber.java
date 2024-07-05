import java.awt.event.*;
import javax.swing.*;

public class SquareNumber extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel inLabel;
    private JLabel outputLabel;
    private JTextField inputField;
    private JButton button;
    private int output;
    private String input;

    public void initComponents() {
        panel = new JPanel();
        this.add(panel);
        panel.setLayout(null);

        inLabel = new JLabel("Enter a number: ");
        inLabel.setBounds(50, 50, 120, 30);
        panel.add(inLabel);

        inputField = new JTextField(20);
        inputField.setBounds(175, 50, 100, 30);
        panel.add(inputField);

        button = new JButton("Calculate Square");
        button.setBounds(100, 100, 150, 30);
        panel.add(button);
        button.addActionListener(this);

        output = 0;
        input = "";
        outputLabel = new JLabel("The square of " + input + " is " + output);
        outputLabel.setBounds(50, 150, 300, 30);
        panel.add(outputLabel);
    }

    public SquareNumber() {
        initComponents();
        setTitle("Square Number Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            input = inputField.getText();
            int num = Integer.parseInt(input);
            output = num * num;
            outputLabel.setText("The square of " + input + " is " + output);
        } catch (NumberFormatException ex) {
            outputLabel.setText("Invalid input. Please enter a valid number.");
        }
        inputField.setText("");
    }

    public static void main(String[] args) {
        new SquareNumber();
    }
}
