package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b;
    String getUsername,getPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
e1=(EditText)findViewById(R.id.username);
e2=(EditText)findViewById(R.id.password);
b=(Button)findViewById(R.id.login);
b.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        getUsername=e1.getText().toString();
        getPass=e2.getText().toString();
        if(getUsername.equals("theater")&&getPass.equals("12345"))
        {
            Intent i=new Intent(getApplicationContext(),Theater.class);
            startActivity(i);
        }
        else {
            Toast.makeText(getApplicationContext(),"invalid",Toast.LENGTH_LONG).show();
        }
    }
});
    }
}