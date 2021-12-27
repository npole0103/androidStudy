package com.example.intentexample3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        Button b1 = (Button)findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_APP_CALCULATOR);
                startActivity(intent);
            }
        });

 */
    }

    public void onClick(View v)
    {
 //       Intent intent = new Intent();
 //       intent.setAction(Intent.ACTION_MAIN);
 //       intent.addCategory(Intent.CATEGORY_APP_CALCULATOR);
 //       startActivity(intent);

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://m.naver.com"));
        startActivity(intent);
    };
}