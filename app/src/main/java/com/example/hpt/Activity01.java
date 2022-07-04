package com.example.hpt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Activity01 extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity01);

        EditText editText1, editText2, editText3, editText4;
        Button Btn3, Btn4;

        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);
        Btn3 = (Button)findViewById(R.id.Btn3);
        Btn4 = (Button)findViewById(R.id.Btn4);

        String num1 = editText1.getText().toString();
        String num2 = editText2.getText().toString();
        String num3 = editText3.getText().toString();
        String num4 = editText3.getText().toString();

        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText3.getText().length()!= editText4.getText().length());
                Toast.makeText(getApplicationContext(),"비밀번호가 동일하지 않습니다.",Toast.LENGTH_LONG).show();
            }
        });

        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText1.getText().length() == 0 || editText2.getText().length() == 0
                        || editText4.getText().length() == 0);
                Toast.makeText(getApplicationContext(),"필수 값을 입력해주세요",Toast.LENGTH_LONG).show();
            }
        });



    }
}
