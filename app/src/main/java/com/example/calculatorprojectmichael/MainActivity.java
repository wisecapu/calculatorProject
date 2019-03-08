package com.example.calculatorprojectmichael;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText EditText1;
        EditText EditText2;
            TextView Answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Enter (View view){
        EditText EditText1 = (EditText)findViewById(R.id.EditText1);
        EditText EditText2 = (EditText)findViewById(R.id.EditText2);
        TextView Answer = (TextView)findViewById(R.id.Answer);

        int FirstNumber = Integer.parseInt(EditText1.getText().toString());
        int SecondNumber = Integer.parseInt(EditText2.getText().toString());
        int Results = FirstNumber + SecondNumber;

        Answer.setText(Results + "");



    }
}
