package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class addMovie extends AppCompatActivity {
EditText e1,e2,e3,e4,e5,e6;
Button b1,b2;
String getMovie,getLan,getDirector,getActor,getActress,getReleased;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_movie);
       e1=(EditText)findViewById(R.id.moviename);
       e2=(EditText)findViewById(R.id.language);
       e3=(EditText)findViewById(R.id.directorname);
       e4=(EditText)findViewById(R.id.actor);
       e5=(EditText)findViewById(R.id.actress);
       e6=(EditText)findViewById(R.id.releasedyear);
       b1=(Button)findViewById(R.id.submit);
       b2=(Button)findViewById(R.id.backtologin);
       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               getMovie=e1.getText().toString();
               getLan=e2.getText().toString();
               getDirector=e3.getText().toString();
               getActor=e4.getText().toString();
               getActress=e5.getText().toString();
               getReleased=e6.getText().toString();
           }
       });
       b2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(getApplicationContext(), Theater.class);
               startActivity(i);
           }
       });
    }
}