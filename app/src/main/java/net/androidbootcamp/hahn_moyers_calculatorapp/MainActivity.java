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
                    num1 = Double.parseDouble(op1 = op1 + "0");
                }
                else {
                    num2 = Double.parseDouble(op2 = op2 + "0");
                }
                calcView.setText(op1 + operator + op2);
                break;
            case R.id.button1:
                if (operator.equals("")) {
                    num1 = Double.parseDouble(op1 = op1 + "1");
                }
                else {
                    num2 = Double.parseDouble(op2 = op2 + "1");
                }
                calcView.setText(op1 + operator + op2);
                break;
            case R.id.button2:

                calcView.setText(character + "2");
                break;
            case button3:
                calcView.setText(character + "3");
                break;
            case button4:
                calcView.setText(character + "4");
                break;
            case button5:
                calcView.setText(character + "5");
                break;
            case button6:
                calcView.setText(character + "6");
                break;
            case button7:
                calcView.setText(character + "7");
                break;
            case button8:
                calcView.setText(character + "8");
                break;
            case button9:
                calcView.setText(character + "9");
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
            case buttonperiod:
                calcView.setText(character + ".");
                break;
            case buttonC:
                character = "";
                num1 = num2 = 0;
                calcView.setText("");
                break;
            case buttonB:
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