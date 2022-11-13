package com.example.deliverables;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    private Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn2 = (Button) findViewById(R.id.btn2);
        btn1 = (Button) findViewById(R.id.btn1);
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openLoginAsStudent();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openLoginAsInstructor();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openLoginAsAdmin();
            }
        });
    }
    public void openLoginAsAdmin(){
        Intent intent = new Intent(this, LoginAsAdmin.class);
        startActivity(intent);
    }
    public void openLoginAsInstructor(){
        Intent intent = new Intent(this, LoginAsInstructor.class);
        startActivity(intent);
    }
    public void openLoginAsStudent(){
        Intent intent = new Intent(this, LoginAsStudent.class);
        startActivity(intent);
    }

}