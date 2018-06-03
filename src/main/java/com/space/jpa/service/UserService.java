package com.space.jpa.service;

import com.space.jpa.bean.User;

import java.util.List;
/**
 * @author zhuzhe
 * @date 2018/6/3 23:38
 * @email 1529949535@qq.com
 */
public interface UserService {
    List<User> findAll();
}
