package org.example.springboot_blog.repository;

import org.example.springboot_blog.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

//public class BlogRepository {
//}

//JpaRepository 클래스를 상속받을 때 엔터티 article과 엔터티 pk타입 Long을 인수로 넣는다.
//이제 이 리포지토리를 사용할 때 JpaRepository에서 제공하는 여러 메서드를 사용할 수 있음. ex) save()
public interface BlogRepository extends JpaRepository<Article, Long>{

}
