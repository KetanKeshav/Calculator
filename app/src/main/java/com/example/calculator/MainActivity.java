package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String symbol;
    private double num1;
    private  double num2;
    private String answer="";

    private TextView answerTV;
    private Button keyPad0, keyPad1, keyPad2, keyPad3, keyPad4, keyPad5, keyPad6, keyPad7, keyPad8, keyPad9;
    private Button keyPadAdd, keyPadSub, keyPadDiv, keyPadMul, keyPadCE, keyPadEQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerTV= findViewById(R.id.answerTV);

        keyPad0=findViewById(R.id.key_0_btn);
        keyPad1=findViewById(R.id.key_1_btn);
        keyPad2=findViewById(R.id.key_2_btn);
        keyPad3=findViewById(R.id.key_3_btn);
        keyPad4=findViewById(R.id.key_4_btn);
        keyPad5=findViewById(R.id.key_5_btn);
        keyPad6=findViewById(R.id.key_6_btn);
        keyPad7=findViewById(R.id.key_7_btn);
        keyPad8=findViewById(R.id.key_0_btn);
        keyPad9=findViewById(R.id.key_0_btn);

        keyPadAdd=findViewById(R.id.addbtn);
        keyPadSub=findViewById(R.id.subbtn);
        keyPadMul=findViewById(R.id.mulbtn);
        keyPadDiv=findViewById(R.id.divbtn);
        keyPadCE=findViewById(R.id.clearbtn);
        keyPadEQ=findViewById(R.id.equalbtn);

        keyPad0.setOnClickListener(this);
        keyPad1.setOnClickListener(this);
        keyPad2.setOnClickListener(this);
        keyPad3.setOnClickListener(this);
        keyPad4.setOnClickListener(this);
        keyPad5.setOnClickListener(this);
        keyPad6.setOnClickListener(this);
        keyPad7.setOnClickListener(this);
        keyPad8.setOnClickListener(this);
        keyPad9.setOnClickListener(this);

        keyPadAdd.setOnClickListener(this);
        keyPadSub.setOnClickListener(this);
        keyPadMul.setOnClickListener(this);
        keyPadDiv.setOnClickListener(this);
        keyPadCE.setOnClickListener(this);
        keyPadEQ.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.key_0_btn:
                answer=answer+"0";
                answerTV.setText(answer);
                break;

            case R.id.key_1_btn:
                answer=answer+"1";
                answerTV.setText(answer);
                break;

            case R.id.key_2_btn:
                answer=answer+"2";
                answerTV.setText(answer);
                break;

            case R.id.key_3_btn:
                answer=answer+"3";
                answerTV.setText(answer);
                break;

            case R.id.key_4_btn:
                answer=answer+"4";
                answerTV.setText(answer);
                break;

            case R.id.key_5_btn:
                answer=answer+"5";
                answerTV.setText(answer);
                break;

            case R.id.key_6_btn:
                answer=answer+"6";
                answerTV.setText(answer);
                break;

            case R.id.key_7_btn:
                answer=answer+"7";
                answerTV.setText(answer);
                break;

            case R.id.key_8_btn:
                answer=answer+"8";
                answerTV.setText(answer);
                break;

            case R.id.key_9_btn:
                answer=answer+"9";
                answerTV.setText(answer);
                break;

            case R.id.addbtn:
                symbol="+";
                num1= Integer.parseInt(answer);
                answer="";
                break;

            case R.id.subbtn:
                symbol="-";
                num1= Integer.parseInt(answer);
                answer="";
                break;

            case R.id.mulbtn:
                symbol="*";
                num1= Integer.parseInt(answer);
                answer="";
                break;

            case R.id.divbtn:
                symbol="/";
                num1= Integer.parseInt(answer);
                answer="";
                break;

            case R.id.clearbtn:
                answerTV.setText("");
                num1=0;
                num2=0;
                answer="";
                symbol="";
                break;

            case R.id.equalbtn:
                num2=Integer.parseInt(answer);

                switch(symbol){
                    case "+":
                        answerTV.setText("answer: "+(num1+num2));
                        break;

                    case "-":
                        answerTV.setText("answer: "+(num1-num2));
                        break;

                    case "*":
                        answerTV.setText("answer: "+(num1*num2));
                        break;

                    case "/":
                        answerTV.setText("answer: "+(num1/num2));
                        break;
                }

                num1=0;
                num2=0;
                answer="";
                symbol="";

        }

    }
}
