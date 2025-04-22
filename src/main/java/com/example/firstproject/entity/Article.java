package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@ToString
public class Article {

    @Id
    @GeneratedValue//자동 생성 기능 추가(숫자가 재동으로 매겨짐)
    private Long id;
    @Column
    private String title;
    @Column
    private String content;

}
