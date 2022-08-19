package io.laaf.fastcampusprojectboard.repository;

import io.laaf.fastcampusprojectboard.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
