package com.example.cpro.tangobotremote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;


public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase database;
    private DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        database  = FirebaseDatabase.getInstance();
        myRef = database.getReference("stateString");
    }

    public void onClick(View v) {
        myRef.setValue(getResources().getResourceEntryName(v.getId()));
    }
}

