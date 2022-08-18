package com.example.AuthServer.rest;

import com.example.AuthServer.documents.AppUser;
import com.example.AuthServer.mapping.RoleToUserForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
@RestController
@RequestMapping("/api/admin")
public class AdminREST {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<AppUser>> getUsers() {
        return ResponseEntity.ok(userService.getUsers());
    }

    @PostMapping("/role/addroletouser")
    public ResponseEntity<?> addRoleToUser(@RequestBody RoleToUserForm form) {
        userService.addRoleToUser(form.getUsername(), form.getRoleName());
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/deleteuser/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable String id) {
        userService.deleteUserById(id);
        return ResponseEntity.ok().build();
    }
}

 */
