package org.example.springboot_blog.repository;

import org.example.springboot_blog.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

//public class BlogRepository {
//}
public interface BlogRepository extends JpaRepository<Article, Long>{

}
