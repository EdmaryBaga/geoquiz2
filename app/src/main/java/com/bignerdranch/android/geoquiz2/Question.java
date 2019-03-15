/*
* Este es el modelo (manejo y persistencia de datos) de la aplicacion
* */

package com.bignerdranch.android.geoquiz2;

import android.widget.Button;
import android.widget.TextView;

public class Question {

    //Al ser privados necesitamos generar sus setters y getters
    private int mTextResId;
    private boolean mAnswerTrue;


    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }
    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }



    public int getTextResId() {
        return mTextResId;
    }
    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }
}
