package demo.jacoco.api.dto;

import demo.jacoco.persistence.entity.post.PostJpaEntity;
import lombok.Builder;

@Builder
public record PostCreateRequest(
        String title,
        String content
) {
    public PostJpaEntity toEntity() {
        return PostJpaEntity.builder()
                .title(title)
                .content(content)
                .build();
    }
}
