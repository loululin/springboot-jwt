package com.example.springbootjwt.config;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.springbootjwt.entity.TestUser;
import com.example.springbootjwt.service.ITestUserService;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @program: springboot-jwt
 * @description: JwtUserDetailsService
 * @author: loulvlin
 * @create: 2020-10-29 13:43
 */
@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Resource
    private ITestUserService userService;
    @Resource
    private PasswordEncoder bcryptEncoder;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        List<SimpleGrantedAuthority> roles = null;

        TestUser user = userService.getOne(new QueryWrapper<TestUser>().eq("username",userName));

        if (user != null) {
            roles = Arrays.asList(new SimpleGrantedAuthority(user.getRoleName()));
            return new User(user.getUsername(), user.getPassword(), roles);
        } else {
            throw new UsernameNotFoundException("User not found with username: " + userName);
        }
    }
}
