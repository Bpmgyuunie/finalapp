package com.saisai.iwantfoods;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Second_activity  extends AppCompatActivity {


    Button btnstart2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        btnstart2 = findViewById(R.id.btnstart2);
        final Intent next = new Intent(this, third_activity.class);
        btnstart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(next);

            }
        });


    }

}