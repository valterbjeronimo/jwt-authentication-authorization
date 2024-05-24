package com.example.springsecurity.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
}
