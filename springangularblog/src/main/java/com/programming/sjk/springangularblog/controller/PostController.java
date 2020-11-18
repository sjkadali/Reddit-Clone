package com.programming.sjk.springangularblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programming.sjk.springangularblog.dto.PostDto;
import com.programming.sjk.springangularblog.service.PostService;

@RestController
@RequestMapping("/api/posts/")
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@PostMapping
	public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto) {
		postService.createPost(postDto);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}