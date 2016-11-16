package com.example.qtp2t.bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class bundle_sec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle_sec);
        TextView txtv= (TextView) findViewById(R.id.textView);

        Bundle b= getIntent().getExtras();
        String user= b.getString("username");
        String pass= b.getString("password");
        txtv.setText("Username: "+user + "\nPassword: "+pass);

    }
}

