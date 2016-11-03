package com.aspire.quotes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class QuoteActivity extends AppCompatActivity {

    private Button mTrueButton;
    private Button mFalseButton;
    private Button mNextButton;
    private TextView mQuoteBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote);

        mTrueButton = (Button) findViewById(R.id.trueButton);
        mFalseButton = (Button) findViewById(R.id.falseButton);
        mNextButton = (Button) findViewById(R.id.next_button);
        mQuoteBox = (TextView) findViewById(R.id.quoteBox);

        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuoteActivity.this,
                        R.string.right_toast,
                        Toast.LENGTH_SHORT).show();

            }
        });

        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(QuoteActivity.this,
                        R.string.wrong_toast,
                        Toast.LENGTH_SHORT).show();

            }
        });

        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hoganQuote = getString(R.string.quote_hogan_life);
                String kanyeQuote = getString(R.string.quote_kanye_ability_to_learn);
                String malcolmQuote = getString(R.string.quote_malcolm_education);
                String carterGQuote = getString(R.string.quote_carter_g_control);
                String[] quotes = { hoganQuote, kanyeQuote, malcolmQuote, carterGQuote };
                Random random = new Random();
                int i = random.nextInt(quotes.length);

                Toast.makeText(QuoteActivity.this,
                        quotes[i],
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
