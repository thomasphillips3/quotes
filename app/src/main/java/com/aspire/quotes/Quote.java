package com.aspire.quotes;

/**
 * Created by tpphilli on 11/2/16.
 */

public class Quote {
    private String mAuthor;
    private String mKnowledge;
    private String ANONYMOUS_AUTHOR = "Anonymous";
    private int mTextResId;

    public Quote(int textResId, String author, String knowledge) {
        mTextResId = textResId;
        mAuthor = author;
        mKnowledge = knowledge;
    }

    public Quote(int textResId, String knowledge) {
        mTextResId = textResId;
        mAuthor = ANONYMOUS_AUTHOR;
        mKnowledge = knowledge;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public void setAuthor(String author) {
        mAuthor = author;
    }

    public String getKnowledge() {
        return mKnowledge;
    }
    public void setKnowledge(String knowledge) {
        mKnowledge = knowledge;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }
}
