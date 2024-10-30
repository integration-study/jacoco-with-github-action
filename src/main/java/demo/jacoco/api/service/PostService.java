package demo.jacoco.api.service;

import demo.jacoco.api.dto.PostCreateRequest;
import demo.jacoco.api.dto.PostInfoResponse;
import demo.jacoco.persistence.entity.post.PostJpaEntity;
import demo.jacoco.persistence.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(final PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void createPost(PostCreateRequest request) {
        postRepository.save(request.toEntity());
    }

    public PostInfoResponse getPost(Long id){
        PostJpaEntity postJpaEntity = postRepository.getById(id);
        return PostInfoResponse.fromEntity(postJpaEntity);
    }
}
