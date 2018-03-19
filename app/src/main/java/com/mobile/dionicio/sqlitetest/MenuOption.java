package com.mobile.dionicio.sqlitetest;

public class MenuOption{
    private int id;
    private String title;
    private String description;
    private int resource;

    public MenuOption(int id, String title, String description, int resource) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.resource = resource;
    }

    public MenuOption(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public int getResource() {
        return resource;
    }
}
