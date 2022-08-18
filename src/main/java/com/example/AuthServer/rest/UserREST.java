package com.example.AuthServer.rest;

import com.example.AuthServer.documents.AppUser;
import com.example.AuthServer.documents.Role;
import com.example.AuthServer.mapping.RoleToUserForm;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
/*
@RestController
@RequestMapping("/api")
public class UserREST {
    @Autowired
    UserService userService;

    @GetMapping("/me")
    public ResponseEntity<?> me(@AuthenticationPrincipal AppUser user) {
        return ResponseEntity.ok(user);
    }

    @GetMapping("/{id}")
    @PreAuthorize("#user.id == #id")
    public ResponseEntity<?> me(@AuthenticationPrincipal AppUser user, @PathVariable String id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

}
 */
