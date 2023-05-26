package com.example.blooddonor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class Signup extends AppCompatActivity {
    ArrayList<String> ar;

    Spinner sp;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        ar=new ArrayList<String>();
        sp=findViewById(R.id.spinner);
        ar.add("A+");
        ar.add("A-");
        ar.add("B+");
        ar.add("B-");
        ar.add("AB+");
        ar.add("AB-");
        ar.add("O+");
        ar.add("O-");
        adapter=new ArrayAdapter<>(Signup.this,android.R.layout.simple_spinner_dropdown_item,ar);
        sp.setAdapter(adapter);
    }
}