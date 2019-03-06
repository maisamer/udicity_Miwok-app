package com.example.android.miwok;

public class Word {
    private String english ;
    private String miowk ;
    private int imageId = -1;
    private int audioId;

    public Word(String english, String miowk,int id) {
        this.english = english;
        this.miowk = miowk;
        this.audioId=id;
    }

    public Word(String english, String miowk , int imageId,int id) {
        this.english = english;
        this.miowk = miowk;
        this.imageId = imageId ;
        this.audioId = id;
    }

    public String getDefault(){
        return  this.english;
    }

    public String getMiowk(){
        return this.miowk;
    }

    public int getImageId(){
        return this.imageId;
    }

    public int getAudioId(){
        return this.audioId;
    }

    public boolean hasImage(){
        return (imageId!=-1) ;
    }
}
