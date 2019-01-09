package com.example.editext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tv;
    EditText et;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.btn);
        et =(EditText) findViewById(R.id.ed);
        tv=(TextView) findViewById(R.id.tv);
    }

    public void clicked(View view) {
        s=et.getText().toString();
        tv.setText(s);
    }
}
