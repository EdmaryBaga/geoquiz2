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
                Toast toast=Toast.makeText(MainActivity.this,
                        getString(R.string.correctToast),

                        Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER|Gravity.TOP,0,0);
                toast.show();
                            } });

        mFalseButton = (Button) findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(MainActivity.this,
                        R.string.incorrect_toast,
                        Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER|Gravity.TOP,0,0);
                toast.show();


            } });

    }//fin onCreate
}
