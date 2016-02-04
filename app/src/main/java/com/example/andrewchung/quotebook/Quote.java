package com.example.andrewchung.quotebook;

/**
 * Created by andrewmhc on 16-02-04.
 */
public class Quote {
    public String person;
    public String quote;

    public Quote(String mQuote, String mPerson) {
        super();

        quote = mQuote;
        person = mPerson;
    }

    public String getPerson() {
        return person;
    }

    public String getQuote() {
        return quote;
    }
}