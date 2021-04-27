package com.cng457;

public class CommentAndRating {

    private int rating;
    private String comment;

    public String getComment() {
        return comment;
    }
    public CommentAndRating(String comment, int rating) {
        this.comment = comment;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }




}