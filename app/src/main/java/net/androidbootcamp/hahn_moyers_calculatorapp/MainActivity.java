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
        button0 = (Button) findViewById(button0);
        button1 = (Button) findViewById(button1);
        button2 = (Button) findViewById(button2);
        button3 = (Button) findViewById(button3);
        button4 = (Button) findViewById(button4);
        button5 = (Button) findViewById(button5);
        button6 = (Button) findViewById(button6);
        button7 = (Button) findViewById(button7);
        button8 = (Button) findViewById(button8);
        button9 = (Button) findViewById(button9);
        buttonplus = (Button) findViewById(buttonplus);
        buttonminus = (Button) findViewById(buttonminus);
        buttonX = (Button) findViewById(buttonX);
        buttondiv = (Button) findViewById(buttondiv);
        buttoneq = (Button) findViewById(buttoneq);
        buttonperiod = (Button) findViewById(buttonperiod);
        buttonC = (Button) findViewById(buttonC);
        buttonB = (Button) findViewById(buttonB);

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
            case button0:
                if (operator.equals("")) {
                    num1 = Double.parseDouble(op1 = op1 + "0");
                }
                else {
                    num2 = Double.parseDouble(op2 = op2 + "0");
                }
                calcView.setText(op1 + operator + op2);
                break;
            case button1:
                calcView.setText(character + "1");
                if (num1 == 0) {
                    num1 == 1;
                }
                else {
                    num2 == 1;
                }
                break;
            case button2:

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