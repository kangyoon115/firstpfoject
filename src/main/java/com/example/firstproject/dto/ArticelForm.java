package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;

public class ArticelForm {
    private String title;
    private String content;

    public ArticelForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticelForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Article toEntity() {
        return new Article(null,title,content);
    }
}
