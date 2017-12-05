    package com.example.hafiz.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {
    TextView result;
    double result_num,num1,num2;
    EditText number1,number2;
    Button add,subtract,divide,multiply;
    float ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result =(TextView)findViewById(R.id.Result);
        number1=(EditText)findViewById(R.id.Number1);
        number2=(EditText)findViewById(R.id.Number2);
        add=(Button)findViewById(R.id.Add);
        subtract=(Button)findViewById(R.id.Subtract);
        multiply=(Button)findViewById(R.id.Multiply);
        divide=(Button)findViewById(R.id.Divide);

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(number1.getText().toString());
                num2=Double.parseDouble(number2.getText().toString());
                result_num=num1+num2;
                result.setText(String.valueOf(result_num));
            }
        });

        subtract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(number1.getText().toString());
                num2=Double.parseDouble(number2.getText().toString());
                result_num=num1-num2;
                result.setText(String.valueOf(result_num));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(number1.getText().toString());
                num2=Double.parseDouble(number2.getText().toString());
                result_num=num1*num2;
                result.setText(String.valueOf(result_num));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(number1.getText().toString());
                num2=Double.parseDouble(number2.getText().toString());
                result_num=num1/num2;
                result.setText(String.valueOf(result_num));
            }
        });
    }
}
