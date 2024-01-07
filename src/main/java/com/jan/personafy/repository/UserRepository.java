package com.jan.personafy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jan.personafy.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    
}
