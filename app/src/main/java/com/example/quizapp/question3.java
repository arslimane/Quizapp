package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class question3 extends AppCompatActivity {
  Button button;
  RadioGroup radioGroup;
  RadioButton b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        button=findViewById(R.id.q3);
        radioGroup=findViewById(R.id.r2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle=getIntent().getExtras();
                int i=bundle.getInt("a2");
               int id= radioGroup.getCheckedRadioButtonId();
               b=findViewById(id);
               if(b.getText().toString().equals("2")){i++;}
                bundle.putInt("a3",i);
                Intent intent=new Intent(getBaseContext(),question4.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}