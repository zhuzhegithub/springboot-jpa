package com.space.jpa.service.impl;

import com.space.jpa.bean.User;
import com.space.jpa.dao.UserDAO;
import com.space.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhuzhe
 * @date 2018/6/3 23:38
 * @email 1529949535@qq.com
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }
}
