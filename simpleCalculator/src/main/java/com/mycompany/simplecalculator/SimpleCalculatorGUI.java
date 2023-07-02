/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vytas K
 */

package com.mycompany.simplecalculator;

//Imported libraries

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculatorGUI extends JFrame {
    
    private JTextField firstNumberField, secondNumberField, resultField;
    private JButton addButton, subtractButton, multiplyButton, divideButton;

    public SimpleCalculatorGUI() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 4));
        initComponents();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents() {
        firstNumberField = new JTextField();
        secondNumberField = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        addButton = new JButton("Add");
        subtractButton = new JButton("Subtract");
        multiplyButton = new JButton("Multiply");
        divideButton = new JButton("Divide");

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performCalculation('+');
            }
        });
    
        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performCalculation('-');
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performCalculation('*');
            }
        });

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performCalculation('/');
            }
        });
        
        add(new JLabel("First Number: "));
        add(firstNumberField);
        add(new JLabel("Second Number: "));
        add(secondNumberField);
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        add(new JLabel("Result: "));
        add(resultField);
    }
        
    private void performCalculation(char operator) {
        double firstNumber = Double.parseDouble(firstNumberField.getText());
        double secondNumber = Double.parseDouble(secondNumberField.getText());
        double result = 0;

        switch (operator) {
            case '+':
                result = SimpleCalculator.addition(firstNumber, secondNumber);
                break;
            case '-':
                result = SimpleCalculator.subtraction(firstNumber, secondNumber);
                break;
            case '*':
                result = SimpleCalculator.multiplication(firstNumber, secondNumber);
                break;
            case '/':
                result = SimpleCalculator.division(firstNumber, secondNumber);
                break;
        }

        resultField.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SimpleCalculatorGUI();
            }
        });
    }
}