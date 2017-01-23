package com.helloworld.nitsharm.wisecommunication;

/**
 * Created by nitsharm on 11-01-2017.
 */


import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class StartARide extends Activity{

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_a_ride);
        EditText source = (EditText)findViewById(R.id.source);
        EditText destination = (EditText)findViewById(R.id.destination);
        source.addTextChangedListener(watch);
        TextView test = (TextView)findViewById(R.id.TVtest);
        RadioButton Madhapur_1 = (RadioButton) findViewById(R.id.Madhapur1);


    }

    TextWatcher watch = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
        TextView test = (TextView)findViewById(R.id.TVtest);
            test.setText(s);

        }
    };

}
