package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class question4 extends AppCompatActivity {
    Button button;
    RadioGroup radioGroup;
    RadioButton b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        button=findViewById(R.id.q4);
        radioGroup=findViewById(R.id.r3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle=getIntent().getExtras();
                int i=bundle.getInt("a3");
                int id= radioGroup.getCheckedRadioButtonId();
                b=findViewById(id);
                if(b.getText().toString().equals("(x-3)(3y-2)")){i++;}
                bundle.putInt("a4",i);
                Intent intent=new Intent(getBaseContext(),question5.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}