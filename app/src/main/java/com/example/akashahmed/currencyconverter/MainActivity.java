package com.example.anwarhasanshuvo.summer17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btndollar,btntaka;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextAmount);
        btndollar = findViewById(R.id.buttonDollar);
        btntaka = findViewById(R.id.buttonTaka);
        textView = findViewById(R.id.textviewAmount);

        btndollar.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                String amount = editText.getText().toString();
                double a = Double.parseDouble(amount);
                double temp = a/80;

                textView.setText("Amount:" +String.format("%.2f",temp)+"$");
            }
        });

        btntaka.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                String amount = editText.getText().toString();
                double a = Double.parseDouble(amount);
                textView.setText("Amount:" +String.format("%.2f",a*80)+ "Taka");

            }
        });

    }
}
