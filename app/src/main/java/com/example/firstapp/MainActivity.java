package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textview ;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button2);
        textview = findViewById(R.id.textView3);
        editText = findViewById(R.id.editTextText2);
    }
        // it is a interface ...
        // this function is basically for performing some action by clicking the button
//         button.setOnClickListener(new View.OnClickListener() {
//
//             @Override
//             public void onClick(View v) {
//                 String s = editText.getText().toString();
//                 // Toast is basically a popup ..
////                 if(s.isEmpty() ) {
////                     Toast.makeText(MainActivity.this, "Please enter a number", Toast.LENGTH_SHORT).show();
////                 }
//                 // strore the value in a string form
//
//                int kg =  Integer.parseInt(s);
//                double pound  = 2.205 * kg;
//
//                textview.setText("Pound value is "+ pound);
//             }
//         }
     //
   //      );


    //  without click on click we can create a function and set the attribute of func ans pass the reference
    // attribute onClick = calculate. in xml
        public void calculate(View v){
            String s = editText.getText().toString();
            // Toast is basically a popup ..
//                 if(s.isEmpty() ) {
//                     Toast.makeText(MainActivity.this, "Please enter a number", Toast.LENGTH_SHORT).show();
//                 }
            // strore the value in a string form

            int kg =  Integer.parseInt(s);
            double pound  = 2.205 * kg;

            textview.setText("Pound value is "+ pound);

        }

    }
