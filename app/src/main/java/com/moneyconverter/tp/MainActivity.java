package com.moneyconverter.tp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {

        TextView msg;
        EditText msgEdit;
        Button btn;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            msg = findViewById(R.id.msg);
            btn = findViewById(R.id.button);
            msgEdit = findViewById(R.id.msgEdit1);




        }
        public void s(View v){
            Toast.makeText(getApplicationContext(), "heloo", Toast.LENGTH_SHORT).show();
        }
        public void Send(View v){
            Intent intent= new Intent(this,MainActivity2.class);
            intent.putExtra("message",msgEdit.getText().toString());
            Toast.makeText(getApplicationContext(), "msg.getText().toString()", Toast.LENGTH_SHORT).show();
            startActivityForResult(intent,3);
        }
        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent i) {
            super.onActivityResult(requestCode, resultCode, i);
            if (requestCode == 3){
                if (resultCode == RESULT_OK){
                    String reply = i.getStringExtra("messageRep");
                    msg.setVisibility(View.VISIBLE);
                    msg.setText(reply);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Chaine Vide", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }