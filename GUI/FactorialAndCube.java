import java.awt.event.*;
import javax.swing.*;

public class FactorialAndCube extends JFrame implements MouseListener {
    private JPanel panel;
    private JLabel inLabel;
    private JLabel outputLabel;
    private JTextField inputField;
    private JButton button;
    private String input;

    public void initComponents() {
        panel = new JPanel();
        this.add(panel);
        panel.setLayout(null);

        inLabel = new JLabel("Enter a number: ");
        inLabel.setBounds(50, 50, 150, 30);
        panel.add(inLabel);

        inputField = new JTextField(20);
        inputField.setBounds(200, 50, 100, 30);
        panel.add(inputField);

        button = new JButton("Calculate");
        button.setBounds(125, 100, 100, 30);
        panel.add(button);
        button.addMouseListener(this);

        outputLabel = new JLabel("Result will be displayed here");
        outputLabel.setBounds(50, 150, 300, 30);
        panel.add(outputLabel);
    }

    public FactorialAndCube() {
        initComponents();
        setTitle("Factorial and Cube Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private int calculateFactorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *=i;
        }
        return result;
    }

    private int calculateCube(int num) {
        return num * num * num;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        try {
            input = inputField.getText();
            int num = Integer.parseInt(input);
            int factorial = calculateFactorial(num);
            outputLabel.setText("The factorial of " + num + " is " + factorial);
        } catch (NumberFormatException ex) {
            outputLabel.setText("Invalid input. Please enter a valid number.");
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        try {
            input = inputField.getText();
            int num = Integer.parseInt(input);
            int cube = calculateCube(num);
            outputLabel.setText("The cube of " + num + " is " + cube);
        } catch (NumberFormatException ex) {
            outputLabel.setText("Invalid input. Please enter a valid number.");
        }
    }

    // Empty implementations for other MouseListener methods
    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new FactorialAndCube();
    }
}
