package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email;
    EditText password;
    Button login;
    String e,p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       email = (EditText) findViewById(R.id.email);
       password =(EditText) findViewById(R.id.password);
       login =(Button) findViewById(R.id.login);

       login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               e=email.getText().toString();
               p=password.getText().toString();
               if(!e.isEmpty()&&!p.isEmpty())
               { Toast.makeText(MainActivity.this,"You are successfully logged in",Toast.LENGTH_LONG).show();
               }
               else if (e.isEmpty())
               {Toast.makeText(MainActivity.this,"Email is empty",Toast.LENGTH_LONG).show();}
               else if(p.isEmpty()){
               Toast.makeText(MainActivity.this,"Password is empty",Toast.LENGTH_LONG).show();}
               else
               {Toast.makeText(MainActivity.this,"ALL FIELDS ARE EMPTY",Toast.LENGTH_LONG).show();}
           }

       });



}}
