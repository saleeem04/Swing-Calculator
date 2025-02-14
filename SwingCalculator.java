import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class SwingCalculator extends JFrame implements ActionListener {
    private JTextField display;
    private StringBuilder input;
    private final ScriptEngine engine;

    public SwingCalculator() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Initialize script engine for evaluation
        engine = new ScriptEngineManager().getEngineByName("JavaScript");
        input = new StringBuilder();

        // Display field
        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Buttons panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));
        String[] buttons = {
            "7", "8", "9", "/", "C",
            "4", "5", "6", "*", "√",
            "1", "2", "3", "-", "^",
            "0", ".", "=", "+", "(", ")"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            button.addActionListener(this);
            buttonPanel.add(button);
        }
        add(buttonPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        
        if (cmd.equals("C")) {
            input.setLength(0);
            display.setText("");
        } else if (cmd.equals("=")) {
            evaluateExpression();
        } else if (cmd.equals("√")) {
            handleSquareRoot();
        } else if (isValidInput(cmd)) {
            input.append(cmd);
            display.setText(input.toString());
        }
    }

    private boolean isValidInput(String cmd) {
        if (cmd.matches("[0-9().]")) return true;
        if (cmd.matches("[+\\-*/^√]")) {
            return !input.toString().matches(".*[+\\-*/^√]$");
        }
        return false;
    }

    private void handleSquareRoot() {
        try {
            double value = Double.parseDouble(input.toString());
            if (value < 0) {
                display.setText("Error: Negative √");
            } else {
                display.setText(String.valueOf(Math.sqrt(value)));
                input.setLength(0);
                input.append(Math.sqrt(value));
            }
        } catch (NumberFormatException ex) {
            display.setText("Invalid Input");
        }
    }

    private void evaluateExpression() {
        try {
            String expression = input.toString().replace("^", "**");
            if (!isBalanced(expression)) {
                display.setText("Error: Unbalanced parentheses");
                return;
            }
            Object result = engine.eval(expression);
            if (result.toString().equals("Infinity")) {
                display.setText("Error: Division by zero");
            } else {
                display.setText(result.toString());
                input.setLength(0);
                input.append(result.toString());
            }
        } catch (ScriptException ex) {
            display.setText("Error: Invalid expression");
        }
    }

    private boolean isBalanced(String expression) {
        int count = 0;
        for (char c : expression.toCharArray()) {
            if (c == '(') count++;
            if (c == ')') count--;
            if (count < 0) return false;
        }
        return count == 0;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SwingCalculator().setVisible(true));
    }
}
