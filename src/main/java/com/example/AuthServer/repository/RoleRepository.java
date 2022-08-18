package com.example.AuthServer.repository;


import com.example.AuthServer.documents.ERole;
import com.example.AuthServer.documents.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role,String> {
    Optional<Role> findByName(ERole name);
}
