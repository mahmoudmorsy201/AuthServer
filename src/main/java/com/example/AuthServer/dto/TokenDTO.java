package com.example.AuthServer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TokenDTO {
    private String userId;
    private String accessToken;
    private String refreshToken;
    private String username;
    private List<String> roles;
    private String type = "Bearer ";

    public TokenDTO(String userId, String accessToken, String refreshToken, String username, List<String> roles) {
        this.userId = userId;
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.username = username;
        this.roles = roles;
    }
}