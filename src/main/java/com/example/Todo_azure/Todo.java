package com.example.Todo_azure;

import java.util.UUID;

public class Todo {

    private UUID id;

    private String text;

    public Todo(UUID id, String text) {
        this.id = id;
        this.text = text;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
