package demo.jacoco.persistence.entity.post;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;

@Getter
@Table(name = "post")
@Entity
public class PostJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long id;

    @Column(name = "post_title", nullable = false)
    private String title;

    @Column(name = "post_content")
    private String content;

    @Column(name = "post_like_count")
    private Integer likeCount;

    protected PostJpaEntity() {}

    @Builder
    private PostJpaEntity(String title, String content) {
        this.title = title;
        this.content = content;
        this.likeCount = 0;
    }
}
