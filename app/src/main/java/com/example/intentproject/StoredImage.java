package com.example.intentproject;

import android.net.Uri;

import java.io.Serializable;

public class StoredImage implements Serializable {
    private Uri uriPic;

    public String setUri(Uri uriPic){
        String uriString = uriPic.toString();
        return uriString;
    }
    public Uri getUri(String uriString){
        uriPic = Uri.parse(uriString);
        return uriPic;
    }
}
