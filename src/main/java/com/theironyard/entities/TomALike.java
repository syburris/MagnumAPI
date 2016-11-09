package com.theironyard.entities;

import javax.persistence.*;

/**
 * Created by stevenburris on 11/9/16.
 */
@Entity
@Table(name = "tomalikes")
public class TomALike {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String filename;

    @Column(nullable = false)
    String comment;

    @Column(nullable = false)
    int votes;

    @ManyToOne
    User user;

    public TomALike() {
    }

    public TomALike(String filename, String comment, int votes, User user) {
        this.filename = filename;
        this.comment = comment;
        this.votes = votes;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
