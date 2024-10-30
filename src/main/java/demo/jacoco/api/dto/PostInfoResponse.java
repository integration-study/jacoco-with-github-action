package demo.jacoco.api.dto;

import demo.jacoco.persistence.entity.post.PostJpaEntity;
import lombok.Builder;

@Builder
public record PostInfoResponse(
        Long id,
        String title,
        String content,
        Integer likeCount
) {
    public static PostInfoResponse fromEntity(PostJpaEntity postJpaEntity) {
        return PostInfoResponse.builder()
                .id(postJpaEntity.getId())
                .title(postJpaEntity.getTitle())
                .content(postJpaEntity.getContent())
                .likeCount(postJpaEntity.getLikeCount())
                .build();
    }
}
