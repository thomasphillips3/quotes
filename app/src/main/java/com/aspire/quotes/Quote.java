package com.aspire.quiz.quotes;

/**
 * Created by tpphilli on 11/2/16.
 */

public class Quote {
    private int mTextResId;
    private boolean mAnswerTrue;

    public void setTextResId(int textResId) {

        mTextResId = textResId;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public boolean isAnswerTrue() {

        return mAnswerTrue;
    }

    public Quote(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }
}
