package de.ur.mi.kilroy.backend.objects;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by simon on 02/09/15.
 */
public class Post {
    private int id;
    private String title;
    private String content;
    private Date publishing_date;
    private List<Comment> comments;

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublishing_date() {
        return publishing_date;
    }

    public void setPublishing_date(Date publishing_date) {
        this.publishing_date = publishing_date;
    }
}
