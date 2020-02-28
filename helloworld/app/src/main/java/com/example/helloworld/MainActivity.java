package com.example.account;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView display;
    Button button;
    EditText editText;
    RadioGroup radioGroup;
    ImageView imageView1,imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display=findViewById(R.id.textView);
        button=findViewById(R.id.button);
        editText=findViewById(R.id.editText);
        radioGroup=findViewById(R.id.radioGroup);
        imageView1=findViewById(R.id.imageButton);
        imageView2=findViewById(R.id.imageButton2);

           radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
               @Override
               public void onCheckedChanged(RadioGroup group, int i) {
                   if (i == R.id.radioButton3) {
                       button.setOnClickListener(new View.OnClickListener() {
                           @Override
                           public void onClick(View view) {
                               String s = editText.getText().toString();
                               if (TextUtils.isEmpty(s)) {
                                   s = "0";
                               }
                               display.setText(s);
                           }
                       });
                   } else {
                       button.setOnClickListener(new View.OnClickListener() {
                           @Override
                           public void onClick(View view) {
                               String s = editText.getText().toString();
                               if (TextUtils.isEmpty(s)) {
                                   s = "0";
                               }
                               display.setText("-" + s);
                           }
                       });
                   }
               }
           });
    }
}
