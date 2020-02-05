package com.example.android.miwok;


public class Word {

    private String DefaultTranslation;
    private String englishTranslation;

    public Word(String defaultTranslation, String englishTranslation) {
        DefaultTranslation = defaultTranslation;
        this.englishTranslation = englishTranslation;
    }

    public String getDefaultTranslation() {
        return DefaultTranslation;
    }

    public String getEnglishTranslation() {
        return englishTranslation;
    }

}