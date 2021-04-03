package com.brijesh.restful.beans;

public class Post {
    private Integer id;
    private String description;
    private Integer userId;

    public Post(Integer id, String description, Integer userId) {
        this.id = id;
        this.description = description;
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", userId=" + userId +
                '}';
    }
}
