package com.example.springbootjwt.entity;

/**
 * @program: springboot-jwt
 * @description: JwtResponse
 * @author: loulvlin
 * @create: 2020-10-29 13:53
 */
public class AuthenticationResponse {


    private String token;

    public AuthenticationResponse()
    {

    }

    public AuthenticationResponse(String token) {
        super();
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
