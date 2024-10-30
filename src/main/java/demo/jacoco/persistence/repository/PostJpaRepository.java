package demo.jacoco.persistence.repository;

import demo.jacoco.persistence.entity.post.PostJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostJpaRepository extends JpaRepository<PostJpaEntity, Long> {
}
