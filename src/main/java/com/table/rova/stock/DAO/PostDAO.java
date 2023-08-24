package com.table.rova.stock.DAO;

import com.table.rova.stock.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PostDAO  extends JpaRepository<Post , Long> {
    @Query("SELECT p FROM Post p ORDER BY p.id DESC LIMIT 1")
  Post findLastPost();
}
