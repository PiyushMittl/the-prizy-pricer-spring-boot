package com.piyush.springboot.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.piyush.springboot.entity.Article;
@Service
public interface IArticleService {
     List<Article> getAllArticles();
     Article getArticleById(int articleId);
     boolean addArticle(Article article);
     void updateArticle(Article article);
     void deleteArticle(int articleId);
} 