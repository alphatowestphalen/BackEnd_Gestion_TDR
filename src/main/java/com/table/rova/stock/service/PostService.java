package com.table.rova.stock.service;

import com.table.rova.stock.DAO.PostDAO;
import com.table.rova.stock.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostDAO postDAO;

    public List<Post> getPostList() {
        return postDAO.findAll();
    }
    public Post findByIdPost(Long id){
        return postDAO.findById(id).orElse(null);
    }
    public void deletePost(Long id) {
        this.postDAO.deleteById(id);
    }
    public String createPost(Post post) {
        postDAO.save(post);
        return "votre ajout est avec succée";
    }
    public void updatePost(Post post , Long id) {
            this.postDAO.save(post);
    }

    public Post getEndId() {
       return this.postDAO.findLastPost();
    }
}
