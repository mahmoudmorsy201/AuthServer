package com.example.AuthServer.service;

import com.example.AuthServer.documents.AppUser;
import com.example.AuthServer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    public AppUser loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("username not found"));
    }

    public AppUser findById(String id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UsernameNotFoundException("user id not found"));
    }

    public List<AppUser> getAllUsers()  {
        return userRepository.findAll();
    }

    public void deleteUserById(String id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteUserById(id);
        }else {
            throw new UsernameNotFoundException("user id not found");
        }
    }

}

