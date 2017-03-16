package daniyyeltouboul.playroom;


import android.graphics.Bitmap;

/**
 * Created by Daniyyel on 28/02/2017.
 */

public class Room {

    private Bitmap profilePhoto;
    private String userName;
    private String joinTime;
    private String genres;
    private String songName;
    private String artistName;
    private String songNumber;
    private String userNumber;
    private Bitmap videoPhoto;

    public Room(Bitmap profilePhoto, String userName, String joinTime, String genres, String songName, String artistName, String songNumber, String userNumber, Bitmap videoPhoto) {
        this.profilePhoto = profilePhoto;
        this.userName = userName;
        this.joinTime = joinTime;
        this.genres = genres;
        this.songName = songName;
        this.artistName = artistName;
        this.songNumber = songNumber;
        this.userNumber = userNumber;
        this.videoPhoto = videoPhoto;
    }

    public Bitmap getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(Bitmap profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(String joinTime) {
        this.joinTime = joinTime;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getSongNumber() {
        return songNumber;
    }

    public void setSongNumber(String songNumber) {
        this.songNumber = songNumber;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public Bitmap getVideoPhoto() {
        return videoPhoto;
    }

    public void setVideoPhoto(Bitmap videoPhoto) {
        this.videoPhoto = videoPhoto;
    }
}
