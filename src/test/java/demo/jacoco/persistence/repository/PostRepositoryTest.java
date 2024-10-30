package demo.jacoco.persistence.repository;

import static org.assertj.core.api.Assertions.assertThat;

import demo.jacoco.api.dto.PostCreateRequest;
import demo.jacoco.persistence.entity.post.PostJpaEntity;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

@DataJpaTest
@Import(PostRepositoryImpl.class)
class PostRepositoryTest {

    @Autowired
    private PostRepository postRepository;

    @DisplayName("포스트를 저장할 수 있다.")
    @Test
    void save() {
        // Given
        PostCreateRequest postCreateRequest = createPostRequest("테스트 제목", "테스트 내용");

        // When
        postRepository.save(postCreateRequest.toEntity());

        // Then
        PostJpaEntity postJpaEntity = postRepository.getById(1L);
        assertThat(postJpaEntity).isNotNull()
                .extracting("title", "content")
                .containsExactly("테스트 제목", "테스트 내용");
    }

    private static PostCreateRequest createPostRequest(String title, String content) {
        return PostCreateRequest.builder()
                .title(title)
                .content(content)
                .build();
    }

}