package com.weicongli.demo.mytentcootest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by 李炜聪 on 2016/10/21.
 */

public class Second extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        Button btn = (Button) findViewById(R.id.btn);
        final EditText tva = (EditText) findViewById(R.id.tva);
        final EditText tvb = (EditText) findViewById(R.id.tvb);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String avalue = tva.getText().toString();
                tvb.setText(avalue);
            }
        });
    }
}
