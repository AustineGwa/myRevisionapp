package com.austinegwa64.myrevisionapp.Models;

/**
 * Created by gwaza on 3/22/2018.
 */

public class Video {

   private  int videoID;
   private  String videoName;
   private  String videoUrl;
   private  int videoImage;

    public Video() {
    }

    public Video(int videoID, String videoName, String videoUrl, int videoImage) {
        this.videoID = videoID;
        this.videoName = videoName;
        this.videoUrl = videoUrl;
        this.videoImage = videoImage;
    }

    public int getVideoImage() {
        return videoImage;
    }

    public void setVideoImage(int videoImage) {
        this.videoImage = videoImage;
    }

    public int getVideoID() {
        return videoID;
    }

    public void setVideoID(int videoID) {
        this.videoID = videoID;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
