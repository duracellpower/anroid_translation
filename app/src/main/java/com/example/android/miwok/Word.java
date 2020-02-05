package com.example.android.miwok;


public class Word {

    private String DefaultTranslation;
    private String englishTranslation;
//    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Word(String defaultTranslation, String englishTranslation) {
        DefaultTranslation = defaultTranslation;
        this.englishTranslation = englishTranslation;
//        mImageResourceId = imageResourceId;
    }

    public String getDefaultTranslation() {
        return DefaultTranslation;
    }

    public String getEnglishTranslation() {
        return englishTranslation;
    }

//    public int getImageResourceId() {
//        return mImageResourceId;
//    }
//
//    public boolean hasImage() {
//        return mImageResourceId != NO_IMAGE_PROVIDED;
//    }

}