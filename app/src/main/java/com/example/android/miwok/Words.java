package com.example.android.miwok;

/**
 * Created by vikram singh on 20-08-2016.
 */
public class Words {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = -1;
    private int mAudioResourceId;

    //constructor for phrases activity
    public Words(String miwokTranslation, String defaultTranslation,int audioResourceId)
    {
        this.mMiwokTranslation = miwokTranslation;
        this.mDefaultTranslation = defaultTranslation;
        this.mAudioResourceId =  audioResourceId;
    }

    //constructor for other ativities
    public Words(String miwokTranslation, String defaultTranslation, int imageResourceId, int audioResourceId)
    {
        this.mMiwokTranslation = miwokTranslation;
        this.mDefaultTranslation = defaultTranslation;
        this.mImageResourceId = imageResourceId;
        this.mAudioResourceId = audioResourceId;
    }

    public String getMiwokTranslation()
    {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
    public int getmAudioResourceId(){
        return mAudioResourceId;
    }

    public int hasImageResourceId()
    {
        return mImageResourceId;
    }
}
