package io.laaf.fastcampusprojectboard.repository;

import io.laaf.fastcampusprojectboard.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
