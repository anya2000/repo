package com.example.model;

/**
 * Created by Anya.Grinberg on 3/23/2016.
 */

public class Lesson {
    private String id;
    private String title;
    private String dbTag;

    public Lesson(String id, String title, String dbTag) {
        this.id = id;
        this.title = title;
        this.dbTag = dbTag;
    }

    public Lesson() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDbTag() {
        return dbTag;
    }

    public void setDbTag(String dbTag) {
        this.dbTag = dbTag;
    }
}
