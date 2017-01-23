package com.helloworld.nitsharm.wisecommunication;

/**
 * Created by nitsharm on 10-01-2017.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Signup extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_sign_up);


        Button mEmailSignUpButton = (Button) findViewById(R.id.email_signup_button);
        mEmailSignUpButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), LoginActivity.class);
                startActivityForResult(myIntent, 0);

               // DialogFragmentCreate();
            }
        });
    }


}

