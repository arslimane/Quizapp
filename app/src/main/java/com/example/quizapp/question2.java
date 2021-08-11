package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class question2 extends AppCompatActivity {
    Button next2;
    RadioGroup radioGroup;
    RadioButton b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        next2=findViewById(R.id.q2);
        radioGroup=findViewById(R.id.r1);

        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=radioGroup.getCheckedRadioButtonId();
                b=findViewById(id);
                Bundle bundle=getIntent().getExtras();
                int i=bundle.getInt("a1");
             if(b.getText().toString().equals("5")){i++;}
               bundle.putInt("a2",i);
               Intent intent=new Intent(getBaseContext(),question3.class);
               intent.putExtras(bundle);
               startActivity(intent);
            }
        });

    }
}