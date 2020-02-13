package Calc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends javax.swing.JFrame {


    private JPanel panel;
    private JTextField txtDisplay;

    private JButton btnTwo;
    private JButton btnEquals;
    private JButton btnDivide;
    private JButton btnThree;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnPoint;
    private JButton btnAdd;
    private JButton btnSix;
    private JButton btnNine;
    private JButton btnClear;
    private JButton btnMinus;
    private JButton btnMultiply;
    private JButton btnOne;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnZero;

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char whichButton;

    public Calculator() {
        initialiseButtons();
    }

    //Method which initialises the buttons and displays the input from the user
    public void initialiseButtons() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnOneText = txtDisplay.getText() + btnOne.getText();
                txtDisplay.setText(btnOneText);
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnTwoText = txtDisplay.getText() + btnTwo.getText();
                txtDisplay.setText(btnTwoText);
            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnThreeText = txtDisplay.getText() + btnThree.getText();
                txtDisplay.setText(btnThreeText);
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnFourText = txtDisplay.getText() + btnFour.getText();
                txtDisplay.setText(btnFourText);
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnFiveText = txtDisplay.getText() + btnFive.getText();
                txtDisplay.setText(btnFiveText);
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnSixText = txtDisplay.getText() + btnSix.getText();
                txtDisplay.setText(btnSixText);
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnSevenText = txtDisplay.getText() + btnSeven.getText();
                txtDisplay.setText(btnSevenText);
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnEightText = txtDisplay.getText() + btnEight.getText();
                txtDisplay.setText(btnEightText);
            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnNineText = txtDisplay.getText() + btnNine.getText();
                txtDisplay.setText(btnNineText);
            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnZeroText = txtDisplay.getText() + btnZero.getText();
                txtDisplay.setText(btnZeroText);
            }
        });
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnPointText = txtDisplay.getText() + btnPoint.getText();
                txtDisplay.setText(btnPointText);
            }
        });

        //Add button
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonText = btnAdd.getText();
                whichOperator(buttonText);
            }
        });

        //Minus button
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonText = btnMinus.getText();
                whichOperator(buttonText);
            }
        });

        //Multiply Button
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonText = btnMultiply.getText();
                whichOperator(buttonText);
            }
        });

        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String buttonText = btnDivide.getText();
                whichOperator(buttonText);
            }
        });

        //Equals button
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (whichButton == '+') {
                    total2 = total1 + Double.parseDouble(txtDisplay.getText());
                } else if (whichButton == '-') {
                    total2 = total1 - Double.parseDouble(txtDisplay.getText());
                } else if (whichButton == '*') {
                    total2 = total1 * Double.parseDouble(txtDisplay.getText());
                } else if (whichButton == '/') {
                    total2 = total1 / Double.parseDouble(txtDisplay.getText());
                }
                txtDisplay.setText(Double.toString(total2));
                total1 = 0;
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                total2 = 0;
                txtDisplay.setText("");
            }
        });
    }

    private void whichOperator(String btnText) {
        //Convert String to char
        whichButton = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Calculator");
        frame.setContentPane(new Calculator().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
