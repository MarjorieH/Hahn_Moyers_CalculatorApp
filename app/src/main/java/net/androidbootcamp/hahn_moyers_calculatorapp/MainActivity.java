package net.androidbootcamp.hahn_moyers_calculatorapp;


import android.os.Bundle;
import android.app.Activity;
//import android.view.Menu;
//import android.view.MenuItem;
//import android.support.v4.app.NavUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends Activity implements View.OnClickListener {

    double num1;
    double num2;

    // allocate variables for buttons
    private Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonplus, buttonminus, buttonX, buttondiv, buttoneq, buttonperiod, buttonC, buttonB;

    // allocate variables for text calculation view
    private EditText calcView;

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
        calcView = (EditText) findViewById(calcView);

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
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_main, menu);
//        return true;
//    }
}