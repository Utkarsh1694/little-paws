package com.pet.repositories;

import com.pet.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

    public User findUserByEmailId(String email);


}
