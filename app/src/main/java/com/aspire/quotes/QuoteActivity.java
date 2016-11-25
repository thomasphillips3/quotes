package com.aspire.quotes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class QuoteActivity extends AppCompatActivity {

    private Button mPrevButton;
    private Button mNextButton;
    private Button mRandomButton;
    private TextView mQuoteTextView;

    String hulkHogan = "Hulk Hogan";
    String kanyeWest = "Kanye West";
    String malcolmX = "Malcolm X";
    String carterG = "Carter G. Woodson";

    private Quote[] mQuoteBank = new Quote[] {
            new Quote(R.string.quote_hogan_life, hulkHogan),
            new Quote(R.string.quote_kanye_ability_to_learn, kanyeWest),
            new Quote(R.string.quote_malcolm_education, malcolmX),
            new Quote(R.string.quote_carter_g_control, carterG)
    };

    private int mCurrentIndex = 0;

    private void updateQuote() {
        int quote = mQuoteBank[mCurrentIndex].getTextResId();
        mQuoteTextView.setText(quote);
    }

    private int getRandomQuote() {
        Random random = new Random();
        return random.nextInt(mQuoteBank.length);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote);

        mPrevButton = (Button) findViewById(R.id.prevButton);
        mNextButton = (Button) findViewById(R.id.nextButton);
        mRandomButton = (Button) findViewById(R.id.random_button);

        mQuoteTextView = (TextView) findViewById(R.id.quoteBox);
        int quote = mQuoteBank[mCurrentIndex].getTextResId();
        mQuoteTextView.setText(quote);

        mPrevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCurrentIndex > 0)
                    mCurrentIndex--;
                else
                    mCurrentIndex = mQuoteBank.length-1;

                updateQuote();

                Toast.makeText(QuoteActivity.this,
                        R.string.prev_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });

        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCurrentIndex < mQuoteBank.length - 1)
                    mCurrentIndex++;
                else
                    mCurrentIndex = 0;

                updateQuote();

                Toast.makeText(QuoteActivity.this,
                        R.string.next_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });

        mRandomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentIndex = getRandomQuote();
                updateQuote();

                Toast.makeText(QuoteActivity.this,
                        R.string.random_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
