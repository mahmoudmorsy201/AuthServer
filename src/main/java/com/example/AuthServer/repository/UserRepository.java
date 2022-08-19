package com.example.AuthServer.repository;

import com.example.AuthServer.documents.AppUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface UserRepository extends MongoRepository<AppUser, String> {

    Optional<AppUser> findByUsername(String username);

    AppUser findUserById(String id);

    Boolean existsByUsername(String username);

    void deleteUserById(String id);

}
