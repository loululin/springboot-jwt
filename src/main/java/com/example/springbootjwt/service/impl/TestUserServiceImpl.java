package com.example.springbootjwt.service.impl;

import com.example.springbootjwt.entity.TestUser;
import com.example.springbootjwt.dao.TestUserMapper;
import com.example.springbootjwt.service.ITestUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * test 服务实现类
 * </p>
 *
 * @author loulvlin
 * @since 2020-10-29
 */
@Service
public class TestUserServiceImpl extends ServiceImpl<TestUserMapper, TestUser> implements ITestUserService {

}
