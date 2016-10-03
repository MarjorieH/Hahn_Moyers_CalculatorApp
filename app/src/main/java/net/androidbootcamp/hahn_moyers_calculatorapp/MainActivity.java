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
        calcView = (TextView) findViewById(calcView);

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
            case buttonplus:
                calcView.setText(character + " + ");
                break;
            case buttonminus:
                calcView.setText(character + " - ");
                break;
            case buttonX:
                calcView.setText(character + " x ");
                break;
            case buttondiv:
                calcView.setText(character + " / ");
                break;
            case buttoneq:
                if (operator == "" || op2 == "") {
                    // do nothing
                }
                else if (operator == " + ") {
                    num1 = num1 + num2;
                    op1 = Double.toString(num1);
                    num2 = 0;
                    op2 = "";
                    operator = "";
                    calcView.setText("op1");
                }
                else if (operator == " - ") {
                    num1 = num1 - num2;
                    op1 = Double.toString(num1);
                    num2 = 0;
                    op2 = "";
                    operator = "";
                    calcView.setText("op1");
                }
                else if (operator == " / ") {
                    num1 = num1 / num2;
                    op1 = Double.toString(num1);
                    num2 = 0;
                    op2 = "";
                    operator = "";
                    calcView.setText("op1");
                }
                else if (operator == " x ") {
                    num1 = num1 * num2;
                    op1 = Double.toString(num1);
                    num2 = 0;
                    op2 = "";
                    operator = "";
                    calcView.setText("op1");
                }
                break;
            case R.id.buttonperiod:
                if (operator.equals("")) {
                    num1 = Double.parseDouble(op1 += "1");
                }
                else {
                    num2 = Double.parseDouble(op2 += "1");
                }
                calcView.setText(op1 + operator + op2);
                break;
            case buttonC:
                op1 = op2 = operator = "";
                calcView.setText(op1 + operator + op2);
                break;
            case buttonB:
                if (operator.equals("")) {
                    num1 = Double.parseDouble(op1 = op1.substring(0, op1.length()-1));
                }
                else {
                    num2 = Double.parseDouble(op1 = op2.substring(0, op2.length()-1));
                }
                calcView.setText(op1 + operator + op2);
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