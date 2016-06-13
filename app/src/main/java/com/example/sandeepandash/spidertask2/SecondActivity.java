package com.example.sandeepandash.spidertask2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.Timestamp;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button button= (Button) findViewById(R.id.backButton);






        Bundle data=getIntent().getExtras();
        if(data==null){
            return;
        }
        String name=data.getString("name");
        final TextView textView= (TextView) findViewById(R.id.textView);
            textView.setText("Thank you "+name+" for your response");
    }

    public void goBackFunction(View v)
    {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);
    }

}
