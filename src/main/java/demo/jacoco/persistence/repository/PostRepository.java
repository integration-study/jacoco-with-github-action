package demo.jacoco.persistence.repository;

import demo.jacoco.persistence.entity.post.PostJpaEntity;

public interface PostRepository {
    void save(PostJpaEntity postJpaEntity);

    PostJpaEntity getById(Long id);
}
