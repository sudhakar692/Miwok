package com.example.android.miwok;

public class Word {

    // Miwok translation of the word
    private String mMiwokTranslation;

    // Default translation of the world
    private String mDefaultTranslation;

    // Image resource id
    private Integer mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represent no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
    * Create a new Word object.
     * @param  defaultTranslation is the word in a language that the user is already familiar with
     *                            (Such as English)
     * @param  miwokTranslation is the word in the Miwok language
    */
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, Integer imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the default translation of the word
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     * Get miwok translation of the word
     */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public Integer getImageResourceId() { return mImageResourceId; }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
