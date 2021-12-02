package com.gestion_posts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion_posts.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
