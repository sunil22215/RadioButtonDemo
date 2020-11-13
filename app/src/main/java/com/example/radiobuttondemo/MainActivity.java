package com.example.radiobuttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private RadioButton genderradioButton;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup=findViewById(R.id.radiogroup);

    }
    public void onclickbuttonMethod(View v){
        int selectedId=radioGroup.getCheckedRadioButtonId();
        genderradioButton=(RadioButton) findViewById(selectedId);
        if(selectedId==-1){
            Toast.makeText(MainActivity.this,"Not Selected",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(MainActivity.this,genderradioButton.getText(),Toast.LENGTH_LONG).show();
        }

    }
}