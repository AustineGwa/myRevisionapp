package com.austinegwa64.myrevisionapp.Models;

/**
 * Created by gwaza on 3/26/2018.
 */

public class UserMessage {

    String message;
    User sender;
    Long createdAt;

    public UserMessage() {
    }

    public UserMessage(String message, User sender, Long createdAt) {
        this.message = message;
        this.sender = sender;
        this.createdAt = createdAt;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }
}
