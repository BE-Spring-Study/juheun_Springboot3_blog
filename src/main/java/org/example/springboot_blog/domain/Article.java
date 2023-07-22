package org.example.springboot_blog.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


//엔터티를 만들자!
@Entity                 //엔터티로 지정
//lombok의 애너테이션
@Getter                                                 //클래스 필드에 대해 별도 코드 없이 생성자 메서드를 만들 수 있음
@NoArgsConstructor(access = AccessLevel.PROTECTED)      //접근제어자가 protected인 기본 생성자를 별도의 코드 없이 생성 가능함.
public class Article {
    @Id                 //id 필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)         //기본키 자동으로 1씩 증가
    @Column(name = "id", updatable = false)
    private Long  id;

    @Column(name = "title", nullable = false)                   //"title"이라는 값이 not null 컬럼과 매핑
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Builder                        //빌더 패턴으로 객체 생성
    public Article(String title, String content){
        this.title = title;
        this.content = content;
    }

    //기본 생성자
//
//    protected Article() {
//
//    }
//
//    public Long getId(){
//        return id;
//    }
//
//    public String getTitle(){
//        return title;
//    }
//
//    public String getContent(){
//        return content;
//    }
}
