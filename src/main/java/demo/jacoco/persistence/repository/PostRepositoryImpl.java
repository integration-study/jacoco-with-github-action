package demo.jacoco.persistence.repository;

import demo.jacoco.persistence.entity.post.PostJpaEntity;
import org.springframework.stereotype.Repository;

@Repository
public class PostRepositoryImpl implements PostRepository{

    private final PostJpaRepository postJpaRepository;

    public PostRepositoryImpl(PostJpaRepository postJpaRepository) {
        this.postJpaRepository = postJpaRepository;
    }

    @Override
    public void save(PostJpaEntity postJpaEntity) {
        postJpaRepository.save(postJpaEntity);
    }

    @Override
    public PostJpaEntity getById(Long id) {
        return postJpaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Post not found"));
    }
}