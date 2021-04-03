package com.brijesh.restful.controller;

import com.brijesh.restful.beans.Post;
import com.brijesh.restful.service.PostDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostDaoService postDaoService;

    @GetMapping("/users/{id}/posts")
    public List<Post> retrieveAllPosts(@PathVariable int id){
        return postDaoService.findAll(id);
    }

    @PostMapping("/users/{id}/posts")
    @ResponseStatus(HttpStatus.CREATED)
    public Post createPost(@PathVariable int id, @RequestBody Post post){
        return postDaoService.save(post,id);
    }

    @GetMapping("/users/{id}/posts/{post_id}")
    public Post retrievePost(@PathVariable int id,@PathVariable int post_id){
        return postDaoService.findOne(post_id,id);
    }

}
