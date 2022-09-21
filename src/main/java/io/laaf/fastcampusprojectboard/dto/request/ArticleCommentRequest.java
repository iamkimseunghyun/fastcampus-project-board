package io.laaf.fastcampusprojectboard.dto.request;

import io.laaf.fastcampusprojectboard.dto.ArticleCommentDto;
import io.laaf.fastcampusprojectboard.dto.UserAccountDto;

public record ArticleCommentRequest(Long articleId, String content) {

    public static ArticleCommentRequest of(Long articleId, String content) {
        return new ArticleCommentRequest(articleId, content);
    }

    public ArticleCommentDto toDto(UserAccountDto userAccountDto) {
        return ArticleCommentDto.of(
                articleId,
                userAccountDto,
                content
        );
    }

}