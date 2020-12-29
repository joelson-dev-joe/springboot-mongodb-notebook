package com.joemarvi.workshopmongoDB.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joemarvi.workshopmongoDB.domain.Post;
import com.joemarvi.workshopmongoDB.repository.PostRepository;
import com.joemarvi.workshopmongoDB.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		}
	}