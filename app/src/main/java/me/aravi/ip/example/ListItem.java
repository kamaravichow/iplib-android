package me.aravi.ip.example;

import androidx.annotation.Keep;

@Keep
public class ListItem {

    private String title;
    private String content;

    public ListItem() {

    }

    public ListItem(String title, String content) {
        this.title = title;
        this.content = content;
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
}
