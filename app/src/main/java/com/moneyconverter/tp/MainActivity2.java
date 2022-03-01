package com.moneyconverter.tp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public EditText response;
    public TextView msg2;
    public Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        btn = findViewById(R.id.button);
        msg2 = findViewById(R.id.msg2);
        response = findViewById(R.id.msgedit2);

        Intent i = getIntent();
        String message = i.getStringExtra("message");
        msg2.setVisibility(View.VISIBLE);
        msg2.setText(message);

        }
    public void SendRes(View v){
        String reply = response.getText().toString();
        Intent j= new Intent();
        j.putExtra("messageRep",reply);
        if(reply.isEmpty())
        {
            setResult(RESULT_CANCELED);
        }
        else {
            setResult(RESULT_OK,j);
        }
        finish();

    }

    }


