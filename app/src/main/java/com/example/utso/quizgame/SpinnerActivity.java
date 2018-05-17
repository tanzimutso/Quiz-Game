package com.example.utso.quizgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.angmarch.views.NiceSpinner;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    public List<String> data;
    TextView view;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        NiceSpinner niceSpinner = (NiceSpinner) findViewById(R.id.nice_spinner);
        button = (Button) findViewById(R.id.button);
        List<String> dataset = new LinkedList<>(Arrays.asList("Select Category","Bangladesh", "International", "Sports"));
        niceSpinner.attachDataSource(dataset);
        data = dataset;
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,dataset);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        niceSpinner.setAdapter(arrayAdapter);
        niceSpinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //data.remove("Select Category");
        //Toast.makeText(SpinnerActivity.this, "data: "+data.indexOf("International") ,Toast.LENGTH_SHORT).show();
        String category = data.get(position);
    if(category == "Bangladesh") {
        button.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intent = new Intent(SpinnerActivity.this, MainActivity1.class);
                  startActivity(intent);
              }
          }
        );
    }
    else if(category == "International"){
        button.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intent = new Intent(SpinnerActivity.this, InternationalActivity.class);
                  startActivity(intent);
              }
          }
        );
    }

    else if(category == "Sports"){
        button.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intent = new Intent(SpinnerActivity.this, SportsActivity.class);
                  startActivity(intent);
              }
          }
        );
    }


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
