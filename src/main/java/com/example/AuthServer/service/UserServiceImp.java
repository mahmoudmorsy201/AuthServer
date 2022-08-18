package com.example.AuthServer.service;


import com.example.AuthServer.documents.AppUser;
import com.example.AuthServer.documents.Role;
import com.example.AuthServer.repository.RoleRepository;
import com.example.AuthServer.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
@Service @RequiredArgsConstructor  @Slf4j
public class UserServiceImp implements UserService, UserDetailsService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;


    @Autowired
    private MongoTemplate mongoTemplate;



    @Override
    public AppUser saveUser(AppUser user) {
        log.info("Saving new user {} to the database", user.getUsername());
        return userRepository.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Saving new role {} to the database", role.getName());
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        log.info("adding new role {} to user {}", roleName, username);
        AppUser user = userRepository.findByUsername(username);
        Role role = roleRepository.findByName(roleName);
        user.getRoles().add(role);
        mongoTemplate.save(user);
    }

    @Override
    public AppUser getUserByUsername(String username) {
        log.info("Fetching user {} ", username);
        return userRepository.findByUsername(username);
    }

    @Override
    public AppUser getUserById(String id) {
        log.info("Fetching user {} ", id);
        return userRepository.findUserById(id);
    }

    @Override
    public void deleteUserById(String id) {
        AppUser user = userRepository.findUserById(id);
        if(user != null) {
            userRepository.deleteUserById(user.getId());
            mongoTemplate.remove(user);
        }
    }

    @Override
    public List<AppUser> getUsers() {
        log.info("Fetching all users");
        return userRepository.findAll();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser user = userRepository.findByUsername(username);
        if (user == null) {
            log.error("Username not found in the database");
            throw new UsernameNotFoundException("username not found");
        } else {
            log.info("Username found in the database: {}", username);
        }
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        user.getRoles().forEach(
                role -> authorities.add(new SimpleGrantedAuthority(role.getName()))
        );
        return new User(user.getUsername(), user.getPassword(), authorities);
    }
}
 */