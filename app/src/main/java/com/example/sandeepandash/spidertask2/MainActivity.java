package com.example.sandeepandash.spidertask2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner sp;                                          //spinner
        Button b= (Button) findViewById(R.id.submitButton);  //button
        sp= (Spinner) findViewById(R.id.spinner);
        ArrayAdapter adpater= ArrayAdapter.createFromResource(this,R.array.Dept,android.R.layout.simple_spinner_item);
        sp.setAdapter(adpater);
        sp.setOnItemSelectedListener(this);
        Switch s= (Switch) findViewById(R.id.switch1);        //switch
        s.setOnCheckedChangeListener(this);

    }

    public void doSomething(View v)
    {
        EditText editText= (EditText) findViewById(R.id.editText);
        String name=editText.getText().toString();

        if(name==null)
        {
            Toast.makeText(MainActivity.this, "name field is blank", Toast.LENGTH_SHORT).show();

        }
            else {
            Intent i = new Intent(this, SecondActivity.class);

            i.putExtra("name", name);

            startActivity(i);
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked)
        {
            Toast.makeText(MainActivity.this, "You will be allotted a mentor", Toast.LENGTH_SHORT).show();

        }
        else
        {
            Toast.makeText(MainActivity.this, "No mentor", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView myText= (TextView) view;
        Toast.makeText(MainActivity.this, "You selected "+myText.getText(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(MainActivity.this, "Default Branch CSE", Toast.LENGTH_SHORT).show();

    }
}
