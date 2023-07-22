package org.example.springboot_blog.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.springboot_blog.domain.Article;



//컨트롤러에서 요청 본문을 받을 객체
@NoArgsConstructor                      //기본 생성자 추가
@AllArgsConstructor                     //모든 필드 값을 파라미터로 받는 생성자 추가
@Getter
public class AddArticleRequest {

    private String title;
    private String content;


    //Builder패턴 사용
    public Article toEntity() {         //생성자를 사용해 객체 생성
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }


}
