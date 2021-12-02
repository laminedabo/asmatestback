package com.gestion_posts.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gestion_posts.model.Post;
import com.gestion_posts.repository.PostRepository;

@RestController
public class PostController {
	
	@Autowired
	PostRepository postRepo;
	
	@GetMapping("/posts/list")
	public List<Post> all(){
		return postRepo.findAll();
	}

	@PostMapping("/posts/add")
	public Post add(@RequestBody Map<String, String> body) {
		String title = body.get("title");
		String description = body.get("description");
		return postRepo.save(new Post(title, description));
	}
	
	@GetMapping("/posts/{id}")
	public Optional<Post> getPost(@PathVariable String id) {
		int postId = Integer.parseInt(id);
		return postRepo.findById((long) postId);
	}
}
