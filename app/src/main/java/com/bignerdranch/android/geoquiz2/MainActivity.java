package com.bignerdranch.android.geoquiz2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import static android.view.Gravity.*;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button mTrueButton;
    private Button mFalseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTrueButton = (Button) findViewById(R.id.true_button);
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        getString(R.string.correctToast),

                        Toast.LENGTH_SHORT).show();

                mTrueButton.setGravity(Gravity.CENTER|Gravity.LEFT);
                            } });

    }//fin onCreate
}
