package org.example.springboot_blog.service;


import lombok.RequiredArgsConstructor;
import org.example.springboot_blog.domain.Article;
import org.example.springboot_blog.dto.AddArticleRequest;
import org.example.springboot_blog.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }
}
