package com.pet.repositories;

import com.pet.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {

    @Query("{'email : ?0'}")
    public User findByEmailId(String email);



}
