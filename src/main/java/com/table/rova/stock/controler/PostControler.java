package com.table.rova.stock.controler;

import com.table.rova.stock.entity.Post;
import com.table.rova.stock.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostControler {
    @Autowired
    private PostService postService;

    @RequestMapping(method = RequestMethod.GET, value = "/posts")
    public List<Post> getPost(){
        return postService.getPostList();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/post/{id}")
    public Post getPostById(@PathVariable Long id){
        return postService.findByIdPost(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/post/{id}")
    public void delete(@PathVariable Long id){
        this.postService.deletePost(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/post")
    public void create(@RequestBody Post post){
        this.postService.createPost(post);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/post/{id}")
    public void update(@RequestBody Post post, @PathVariable Long id){
        this.postService.updatePost(post, id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/post/EndId")
    public Post getEndId(){
        return  this.postService.getEndId();
    }
}
