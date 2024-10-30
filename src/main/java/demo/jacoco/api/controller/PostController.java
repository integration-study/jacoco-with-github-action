package demo.jacoco.api.controller;

import demo.jacoco.api.dto.PostCreateRequest;
import demo.jacoco.api.dto.PostInfoResponse;
import demo.jacoco.api.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public void createPost(@RequestBody PostCreateRequest request) {
        postService.createPost(request);
    }

    @GetMapping("/{id}")
    public PostInfoResponse getPost(@PathVariable Long id){
        return postService.getPost(id);
    }
}
