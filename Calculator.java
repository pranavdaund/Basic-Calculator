
/**
 * Calculator
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calculator {

    private JFrame frame;
    private JTextField textField;

    /**
     * Launch the application.
     */

    double int1;
    double int2;
    double total;
    String action;
    String answer;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculator window = new Calculator();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Calculator() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 665, 597);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        textField = new JTextField();
        textField.setBackground(Color.WHITE);
        textField.setBounds(119, 46, 421, 77);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JButton btnNewButton = new JButton("C");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(null);
            }
        });
        btnNewButton.setBounds(49, 159, 84, 55);
        frame.getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("7");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText() + btnNewButton_1.getText();
                textField.setText(number);
            }
        });
        btnNewButton_1.setBounds(49, 243, 84, 55);
        frame.getContentPane().add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("4");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText() + btnNewButton_2.getText();
                textField.setText(number);
            }
        });
        btnNewButton_2.setBounds(49, 332, 84, 55);
        frame.getContentPane().add(btnNewButton_2);

        JButton btnNewButton_1_1 = new JButton("1");
        btnNewButton_1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText() + btnNewButton_1_1.getText();
                textField.setText(number);
            }
        });
        btnNewButton_1_1.setBounds(49, 416, 84, 55);
        frame.getContentPane().add(btnNewButton_1_1);

        JButton btnNewButton_3 = new JButton("0");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText() + btnNewButton_3.getText();
                textField.setText(number);
            }
        });
        btnNewButton_3.setBounds(203, 159, 84, 55);
        frame.getContentPane().add(btnNewButton_3);

        JButton btnNewButton_1_2 = new JButton("8");
        btnNewButton_1_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText() + btnNewButton_1_2.getText();
                textField.setText(number);
            }
        });
        btnNewButton_1_2.setBounds(203, 243, 84, 55);
        frame.getContentPane().add(btnNewButton_1_2);

        JButton btnNewButton_2_1 = new JButton("5");
        btnNewButton_2_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText() + btnNewButton_2_1.getText();
                textField.setText(number);
            }
        });
        btnNewButton_2_1.setBounds(203, 332, 84, 55);
        frame.getContentPane().add(btnNewButton_2_1);

        JButton btnNewButton_1_1_1 = new JButton("2");
        btnNewButton_1_1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText() + btnNewButton_1_1_1.getText();
                textField.setText(number);
            }
        });
        btnNewButton_1_1_1.setBounds(203, 416, 84, 55);
        frame.getContentPane().add(btnNewButton_1_1_1);

        JButton btnNewButton_4 = new JButton("/");
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int1 = Double.parseDouble(textField.getText());
                textField.setText("");
                action = "/";
            }
        });
        btnNewButton_4.setBounds(370, 159, 73, 55);
        frame.getContentPane().add(btnNewButton_4);

        JButton btnNewButton_1_3 = new JButton("9");
        btnNewButton_1_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText() + btnNewButton_1_3.getText();
                textField.setText(number);
            }
        });
        btnNewButton_1_3.setBounds(370, 243, 73, 55);
        frame.getContentPane().add(btnNewButton_1_3);

        JButton btnNewButton_2_2 = new JButton("6");
        btnNewButton_2_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText() + btnNewButton_2_2.getText();
                textField.setText(number);
            }
        });
        btnNewButton_2_2.setBounds(370, 332, 73, 55);
        frame.getContentPane().add(btnNewButton_2_2);

        JButton btnNewButton_1_1_2 = new JButton("3");
        btnNewButton_1_1_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText() + btnNewButton_1_1_2.getText();
                textField.setText(number);
            }
        });
        btnNewButton_1_1_2.setBounds(370, 416, 73, 55);
        frame.getContentPane().add(btnNewButton_1_1_2);

        JButton btnNewButton_5 = new JButton("*");
        btnNewButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int1 = Double.parseDouble(textField.getText());
                textField.setText("");
                action = "*";
            }
        });
        btnNewButton_5.setBounds(554, 159, 72, 55);
        frame.getContentPane().add(btnNewButton_5);

        JButton btnNewButton_1_4 = new JButton("-");
        btnNewButton_1_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int1 = Double.parseDouble(textField.getText());
                textField.setText("");
                action = "-";

            }
        });
        btnNewButton_1_4.setBounds(554, 243, 72, 55);
        frame.getContentPane().add(btnNewButton_1_4);

        JButton btnNewButton_2_3 = new JButton("+");
        btnNewButton_2_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int1 = Double.parseDouble(textField.getText());
                textField.setText("");
                action = "+";
            }
        });
        btnNewButton_2_3.setBounds(554, 332, 72, 55);
        frame.getContentPane().add(btnNewButton_2_3);

        JButton btnNewButton_1_1_3 = new JButton("=");
        btnNewButton_1_1_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int2 = Double.parseDouble(textField.getText());

                if (action == "+") {
                    total = int1 + int2;
                    answer = String.format("%2f", total);
                    textField.setText(answer);
                }

                else if (action == "-") {
                    total = int1 - int2;
                    answer = String.format("%2f", total);
                    textField.setText(answer);
                }

                else if (action == "*") {
                    total = int1 * int2;
                    answer = String.format("%2f", total);
                    textField.setText(answer);
                }

                else if (action == "/") {
                    total = int1 / int2;
                    answer = String.format("%2f", total);
                    textField.setText(answer);
                }

            }
        });
        btnNewButton_1_1_3.setBounds(554, 416, 72, 55);
        frame.getContentPane().add(btnNewButton_1_1_3);
    }
}