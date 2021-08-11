package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

public class question5 extends AppCompatActivity {
    Button button;
CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);
        button=findViewById(R.id.q5);
        checkBox1=findViewById(R.id.an5);
        checkBox2=findViewById(R.id.ann5);
        checkBox3=findViewById(R.id.ann2);
        checkBox4=findViewById(R.id.ann3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle=getIntent().getExtras();
                int i=bundle.getInt("a4");
                if(checkBox1.isChecked()&&checkBox2.isChecked()&&!checkBox3.isChecked()&&!checkBox4.isChecked()){i++;}
                bundle.putInt("a5",i);
                Toast toast1= Toast.makeText(getBaseContext(),"you have answer :"+i+"/"+"5 contragulation !!",Toast.LENGTH_LONG);
                Toast toast2= Toast.makeText(getBaseContext(),"you do not  make it "+"you have answer :"+i+"/"+"5 try agin !!",Toast.LENGTH_LONG);
                if (i==5){toast1.show();}else{
                    Intent intent =new Intent(getBaseContext(),MainActivity.class);
                    toast2.show();
                    startActivity(intent);
                }

            }
        });
    }
}