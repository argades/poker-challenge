/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argades.arqhexa.taskgpt.domain.model;

import java.util.UUID;

/**
 *
 * @author Marco Aurelio Osorio
 */
public class Task {
    private UUID id;
    private String description;
    private boolean completed;

    public Task(UUID id, String description, boolean completed) {
        this.id = id;
        this.description = description;
        this.completed = completed;
    }

    public UUID getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    
}
