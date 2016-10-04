package net.androidbootcamp.hahn_moyers_calculatorapp;


import android.os.Bundle;
import android.app.Activity;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.support.v4.app.NavUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {

    // allocate variables for buttons
    private Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonplus, buttonminus, buttonX, buttondiv, buttoneq, buttonperiod, buttonC, buttonB;

    // allocate variables for text calculation view
    private TextView calcView;
    private String op1 = "";
    private String op2 = "";
    private String operator = "";
    private double num1 = 0;
    private double num2 = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // initialize calculator app
        displayCalc();
    }

    private void displayCalc() {

        // initialize button variables, assigned by ID.
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonplus = (Button) findViewById(R.id.buttonplus);
        buttonminus = (Button) findViewById(R.id.buttonminus);
        buttonX = (Button) findViewById(R.id.buttonX);
        buttondiv = (Button) findViewById(R.id.buttondiv);
        buttoneq = (Button) findViewById(R.id.buttoneq);
        buttonperiod = (Button) findViewById(R.id.buttonperiod);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonB = (Button) findViewById(R.id.buttonB);

        // initialize text calculation view, assigned by ID.
        calcView = (TextView) findViewById(R.id.calcView);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonplus.setOnClickListener(this);
        buttonminus.setOnClickListener(this);
        buttonX.setOnClickListener(this);
        buttondiv.setOnClickListener(this);
        buttoneq.setOnClickListener(this);
        buttonperiod.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonB.setOnClickListener(this);



    }


    public void onClick(View view) {

        switch(view.getId()) {
            case R.id.button0:
                if (operator.equals("")) {
                    num1 = Double.parseDouble(op1 += "0");
                }
                else {
                    num2 = Double.parseDouble(op2 += "0");
                }
                calcView.setText(op1 + operator + op2);
                break;
            case R.id.button1:
                if (operator.equals("")) {
                    num1 = Double.parseDouble(op1 += "1");
                }
                else {
                    num2 = Double.parseDouble(op2 += "1");
                }
                calcView.setText(op1 + operator + op2);
                break;
            case R.id.button2:
                if (operator.equals("")) {
                    num1 = Double.parseDouble(op1 += "2");
                }
                else {
                    num2 = Double.parseDouble(op2 += "2");
                }
                calcView.setText(op1 + operator + op2);
                break;
            case R.id.button3:
                if (operator.equals("")) {
                    num1 = Double.parseDouble(op1 += "3");
                }
                else {
                    num2 = Double.parseDouble(op2 += "3");
                }
                calcView.setText(op1 + operator + op2);
                break;
            case R.id.button4:
                if (operator.equals("")) {
                    num1 = Double.parseDouble(op1 += "4");
                }
                else {
                    num2 = Double.parseDouble(op2 += "4");
                }
                calcView.setText(op1 + operator + op2);
                break;
            case R.id.button5:
                if (operator.equals("")) {
                    num1 = Double.parseDouble(op1 += "5");
                }
                else {
                    num2 = Double.parseDouble(op2 += "5");
                }
                calcView.setText(op1 + operator + op2);
                break;
            case R.id.button6:
                if (operator.equals("")) {
                    num1 = Double.parseDouble(op1 += "6");
                }
                else {
                    num2 = Double.parseDouble(op2 += "6");
                }
                calcView.setText(op1 + operator + op2);
                break;
            case R.id.button7:
                if (operator.equals("")) {
                    num1 = Double.parseDouble(op1 += "7");
                }
                else {
                    num2 = Double.parseDouble(op2 += "7");
                }
                calcView.setText(op1 + operator + op2);
                break;
            case R.id.button8:
                if (operator.equals("")) {
                    num1 = Double.parseDouble(op1 += "8");
                }
                else {
                    num2 = Double.parseDouble(op2 += "8");
                }
                calcView.setText(op1 + operator + op2);
                break;
            case R.id.button9:
                if (operator.equals("")) {
                    num1 = Double.parseDouble(op1 += "9");
                }
                else {
                    num2 = Double.parseDouble(op2 += "9");
                }
                calcView.setText(op1 + operator + op2);
                break;
            case R.id.buttonplus:
                if (operator.equals("")) {
                    operator = " + ";
                }
                calcView.setText(op1 + operator + op2);
                break;
            case R.id.buttonminus:
                if (op1.equals("") && operator.equals("") && op2.equals("")) {
                    op1 = "-";
                    num1 = -1;
                }
                else if (!op1.equals("") && operator.equals("") && op2.equals("")) {
                    operator = " - ";
                }
                else if (!op1.equals("") && !operator.equals("") && op2.equals("")) {
                    op2 = "-";
                    num2 = -1;
                }
                else {
                    // do nothing
                }
                calcView.setText(op1 + operator + op2);
                break;
            case R.id.buttonX:
                if (operator == "") {
                    operator = " x ";
                    calcView.setText(op1 + operator);
                }
                break;
            case R.id.buttondiv:
                if (operator == "") {
                    operator = " / ";
                    calcView.setText(op1 + operator);
                }
                break;
            case R.id.buttoneq:
                if (operator == "" || op2 == "") {
                    // do nothing
                }
                else if (operator == " + ") {
                    num1 = num1 + num2;
                    op1 = Double.toString(num1);
                    num2 = 0;
                    op2 = "";
                    operator = "";
                    calcView.setText(op1);
                }
                else if (operator == " - ") {
                    num1 = num1 - num2;
                    op1 = Double.toString(num1);
                    num2 = 0;
                    op2 = "";
                    operator = "";
                    calcView.setText(op1);
                }
                else if (operator == " / ") {
                    if (num2 == 0) {
                        calcView.setText("err: cannot divide by zero");
                    }

                    else {
                        num1 = num1 / num2;
                        op1 = Double.toString(num1);
                        num2 = 0;
                        op2 = "";
                        operator = "";
                        calcView.setText(op1);
                    }
                }
                else if (operator == " x ") {
                    num1 = num1 * num2;
                    op1 = Double.toString(num1);
                    num2 = 0;
                    op2 = "";
                    operator = "";
                    calcView.setText(op1);
                }
                break;
            case R.id.buttonperiod:
                if (operator.equals("")) {
                    if (op1.equals("") || op1.equals("-")) {
                        num1 = Double.parseDouble(op1 += "0.");
                    }
                    else {
                        if (op1.contains(".")) {
                            num1 = Double.parseDouble(op1);
                        }
                        else {
                            num1 = Double.parseDouble(op1 += ".");
                        }
                    }
                }
                else {
                    if (op2.equals("") || op2.equals("-")) {
                        num2 = Double.parseDouble(op2 += "0.");
                    }
                    else {
                        if (op2.contains(".")) {
                            num2 = Double.parseDouble(op2);
                        }
                        else {
                            num2 = Double.parseDouble(op2 += ".");
                        }
                    }
                }
                calcView.setText(op1 + operator + op2);
                break;
            case R.id.buttonC:
                op1 = op2 = operator = "";
                num1 = num2 = 0;
                calcView.setText("0");
                break;
            case R.id.buttonB:

                // if screen is empty / nothing in current calculation, there's nothing to clear
                // so ignore clear button.
                if (op1.equals("")) {
                    // do nothing
                }

                // else if there is content in the first operand but operator and second operand
                // are empty, change the first operand
                else if (!op1.equals("") && operator.equals("") && op2.equals("") ) {

                    // if the length of the first operand is 1, reset operand 1
                    if (op1.length() == 1) {
                        op1 = "";
                        num1 = 0;
                    }

                    // otherwise if length of first operand is n > 1, recreate operand 1 as a
                    // substring of the original operand minus the last character.
                    else {
                        op1 = op1.substring(0, op1.length() - 1);

                        if (op1.equals("-")) {
                            // do nothing
                        }

                        else {
                            num1 = Double.parseDouble(op1);
                        }
                    }

                    calcView.setText(op1);
                }

                // otherwise, if there is content in the first operand and operator but nothing in
                // the second operand, reset the operator
                else if (!operator.equals("") && op2.equals("")) {
                    operator = "";
                    calcView.setText(op1);
                }

                // else, there is content in the first operand, operator, and second operand -- so
                // change the second operand
                else {

                    // if length of second operand is 1, reset operand 2
                    if (op2.length() == 1) {
                        op2 = "";
                        num2 = 0;
                    }

                    // if operand is length > 1, recreate operand as a substring minus the last
                    // character of the original operand

                    else {
                        op2 = op2.substring(0, op2.length() - 1);
                        if (op2.equals("-")) {
                            // do nothing
                        }
                        else {
                            num2 = Double.parseDouble(op2);
                        }

                    }

                    calcView.setText(op1 + operator + op2);
                }

                break;
        }
    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_main, menu);
//        return true;
//    }
}