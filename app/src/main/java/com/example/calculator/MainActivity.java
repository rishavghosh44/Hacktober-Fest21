package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ed1, ed2;
    TextView textView;
    Button button1, button2, button3, button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);

        textView = findViewById(R.id.textView);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1,val2,ans;       //variables

                val1=Integer.parseInt(ed1.getText().toString());
                val2=Integer.parseInt(ed2.getText().toString());

                ans= val1+val2;

                textView.setText("Ans is: "+ ans);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1,val2,ans;       //variables

                val1=Integer.parseInt(ed1.getText().toString());
                val2=Integer.parseInt(ed2.getText().toString());

                ans= val1-val2;

                textView.setText("Ans is: "+ ans);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1,val2,ans;       //variables

                val1=Integer.parseInt(ed1.getText().toString());
                val2=Integer.parseInt(ed2.getText().toString());

                ans= val1*val2;

                textView.setText("Ans is: "+ ans);

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val1,val2,ans;       //variables

                val1=Integer.parseInt(ed1.getText().toString());
                val2=Integer.parseInt(ed2.getText().toString());

                ans= val1/val2;

                textView.setText("Ans is: "+ ans);

            }
        });

    }
}