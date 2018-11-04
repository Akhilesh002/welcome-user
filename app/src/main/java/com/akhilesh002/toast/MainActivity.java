package com.akhilesh002.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

    }

    public void show(View view){
        String name = editText.getText().toString();
        if (TextUtils.isEmpty(name.trim())){
            Toast.makeText(this, "Please enter your name first", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(MainActivity.this, "Welcome "+editText.getText(), Toast.LENGTH_SHORT).show();
        }
    }
}
