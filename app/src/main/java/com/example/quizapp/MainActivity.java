package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button next;
    EditText answer;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next=findViewById(R.id.q1);
        answer=findViewById(R.id.an1);
        next.setOnClickListener((View.OnClickListener) (View view) -> {
            Intent intent=new Intent(this,question2.class);
            String s= answer.getText().toString();
            if(s.equals("3")||s.equals("three")||s.equals("trois")){i++;}
            Bundle bundle=new Bundle();
            bundle.putInt("a1",i);
            intent.putExtras(bundle);
            startActivity(intent);

        });
    }



}