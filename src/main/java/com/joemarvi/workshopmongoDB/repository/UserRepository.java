package com.joemarvi.workshopmongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.joemarvi.workshopmongoDB.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
