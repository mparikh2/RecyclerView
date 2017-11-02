package com.example.milind.recyclerview;

/**
 * Created by Milind on 10/31/2017.
 */

public class ListItem {

    private String name;
    private String realname;
    private String team;
    private String firstappearance;
    private String createdby;
    private String publisher;
    private String imageURL;
    private String bio;

    public ListItem(String name, String bio, String team, String firstappearance, String createdby, String publisher, String imageURL) {
        this.name = name;
        this.bio = bio;
        this.team = team;
        this.firstappearance = firstappearance;
        this.createdby = createdby;
        this.publisher = publisher;
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public String getRealname() {
        return realname;
    }

    public String getTeam() {
        return team;
    }

    public String getFirstappearance() {
        return firstappearance;
    }

    public String getCreatedby() {
        return createdby;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getBio() {
        return bio;
    }
}
