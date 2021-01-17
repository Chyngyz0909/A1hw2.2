package com.example.a1hw22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    Button btn2;
    EditText ednum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn2 = findViewById(R.id.btn2);


        ednum= findViewById(R.id.ednum);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = ednum.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("car",text);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}