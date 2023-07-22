package org.example.springboot_blog.service;


import lombok.RequiredArgsConstructor;
import org.example.springboot_blog.domain.Article;
import org.example.springboot_blog.dto.AddArticleRequest;
import org.example.springboot_blog.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor        // final이 붙거나 @NotNull이 붙은 필드 생성자 추가 / 빈을 생성자로 생성하는 롬복에서 지원하는 애너테이션
@Service                        // 빈으로 등록
public class BlogService {

    private final BlogRepository blogRepository;


    //블로그 글 추가 메서드

    //save()는 JpaRepository에서 지원하는 저장 메서드로 AddArticleRequest 클래스에 저장된 값들을 article 데이터베이스에 저장함.
    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll(){
        return blogRepository.findAll();
    }



    public Article findById(long id) {
        return blogRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("not found: " + id));
    }
}
