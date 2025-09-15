package dev.decafmango.sec_lab1.controller;

import dev.decafmango.sec_lab1.model.dto.PostDto;
import dev.decafmango.sec_lab1.service.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping
    public List<PostDto> getUserPosts() {
        return postService.getUserPosts();
    }

    @PostMapping
    public PostDto createPost(@RequestBody @Valid PostDto postDto) {
        return postService.createPost(postDto);
    }

}
