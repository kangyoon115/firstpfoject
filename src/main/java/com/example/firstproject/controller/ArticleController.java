package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticelForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j//log기능을 위한 어노테이션 추가
public class ArticleController {
    @Autowired// 스프링부트가 미리 생성해 놓은 리파지터리 객체 주입
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticelForm form){
        //System.out.println(form.toString());
        log.info(form.toString());

        //1. DTO를 엔티티로 변환
        Article article=form.toEntity();
        //System.out.println(article.toString());
        log.info(article.toString());

        //2. 리파지터리로 엔티티를 DB에 저장
        Article saved=articleRepository.save(article);
        //System.out.println(saved.toString());
        log.info(saved.toString());

        return "";
    }
}
