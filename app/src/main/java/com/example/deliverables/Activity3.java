package com.example.deliverables;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {
    private Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openLoginAdmin();
            }
        });
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openLoginInstr();
            }
        });
        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openLoginStudent();
            }
        });
    }
    public void openLoginAdmin(){
        Intent intent = new Intent(this, LoginAdmin.class);
        startActivity(intent);
    }
    public void openLoginInstr(){
        Intent intent = new Intent(this, LoginInstr.class);
        startActivity(intent);
    }
    public void openLoginStudent(){
        Intent intent = new Intent(this, LoginStudent.class);
        startActivity(intent);
    }
}