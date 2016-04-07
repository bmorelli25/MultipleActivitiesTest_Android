package com.example.morellib.multipleactivitiestest;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends Activity {

    public void goBack(View view){

        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = (TextView)findViewById(R.id.textView);


        Intent i = getIntent();
        textView.setText(i.getStringExtra("name"));
    }

}
