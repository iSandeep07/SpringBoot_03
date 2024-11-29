package com.springbot_03.springboot_03.entity;

public class JournalEntry {

    private long id;
    private String title;
    private String content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public JournalEntry(long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public JournalEntry() {
    }
}
