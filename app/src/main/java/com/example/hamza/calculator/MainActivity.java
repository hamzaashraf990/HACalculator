package com.example.hamza.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /************************************************
     * Variable Declaration
     * ******************************************/
    Button btnClear;
    TextView numbers, result;
    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero, btnPoint;
    Button btnplus, btnminus, btnmul, btndivide, btnEqual;
    String num;
    Float mValueOne,mValueTwo;
    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**********************************************
         * Initialization
         * *******************************************/
        btnEqual = (Button) findViewById(R.id.btnequal);
        btnClear = (Button) findViewById(R.id.btnclr);
        numbers = (TextView) findViewById(R.id.txtviewcalc);
        result = (TextView) findViewById(R.id.txtviewresult);
        btnOne = (Button) findViewById(R.id.btn1);
        btnTwo = (Button) findViewById(R.id.btn2);
        btnThree = (Button) findViewById(R.id.btn3);
        btnFour = (Button) findViewById(R.id.btn4);
        btnFive = (Button) findViewById(R.id.btn5);
        btnSix = (Button) findViewById(R.id.btn6);
        btnSeven = (Button) findViewById(R.id.btn7);
        btnEight = (Button) findViewById(R.id.btn8);
        btnNine = (Button) findViewById(R.id.btn9);
        btnZero = (Button) findViewById(R.id.btnzero);
        btnPoint = (Button) findViewById(R.id.btnpoint);
        btnplus = (Button) findViewById(R.id.btnplus);
        btnminus = (Button) findViewById(R.id.btnminus);
        btnmul = (Button) findViewById(R.id.btnmul);
        btndivide = (Button) findViewById(R.id.btndiv);

        /***************************************************************
         *   ON-CLICK LISTENER ON NUMBERS BUTTON*************************/


        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = numbers.getText().toString();
                numbers.setText(num + "1");
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = numbers.getText().toString();
                numbers.setText(num + "2");

            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = numbers.getText().toString();
                numbers.setText(num + "3");

            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = numbers.getText().toString();
                numbers.setText(num + "4");
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = numbers.getText().toString();
                numbers.setText(num + "5");
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = numbers.getText().toString();
                numbers.setText(num + "6");
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = numbers.getText().toString();
                numbers.setText(num + "7");
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = numbers.getText().toString();
                numbers.setText(num + "8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = numbers.getText().toString();
                numbers.setText(num + "9");
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = numbers.getText().toString();
                numbers.setText(num + "0");
            }
        });
        /*************************************************************
         * ONCLICK-LISTENER ON FUNCTIONAL BUTTONS
         ************************************************************/

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numbers == null){
                    numbers.setText("");
                }else {
                    mValueOne = Float.parseFloat(numbers.getText() + "");
                    mAddition = true;
                    numbers.setText(null);
                }
            }

        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(numbers.getText() + "");
                mMultiplication = true ;
                numbers.setText(null);
            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(numbers.getText() + "");
                mSubtract = true ;
                numbers.setText(null);
            }
        });
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(numbers.getText()+"");
                mDivision = true ;
                numbers.setText(null);
            }
        });
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=numbers.getText().toString();
                numbers.setText(num+ ".");
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers.setText("");
                result.setText("");
            }
        });
        /*************************************************************
         * ONCLICK-LISTENER ON EQUAL BUTTON!!!!
         ************************************************************/
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValueTwo = Float.parseFloat(numbers.getText() + "");

                if (mAddition == true){

                    result.setText(mValueOne + mValueTwo +"");
                    mAddition=false;
                }


                if (mSubtract == true){
                    result.setText(mValueOne - mValueTwo+"");
                    mSubtract=false;
                }

                if (mMultiplication == true){
                    result.setText(mValueOne * mValueTwo+"");
                    mMultiplication=false;
                }

                if (mDivision == true){
                    result.setText(mValueOne / mValueTwo+"");
                    mDivision=false;
                }
            }

        });

    }
}
