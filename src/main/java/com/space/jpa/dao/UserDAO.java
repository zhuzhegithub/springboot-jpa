package com.space.jpa.dao;

import com.space.jpa.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author zhuzhe
 * @date 2018/6/3 23:32
 * @email 1529949535@qq.com
 */
@Component
public interface UserDAO extends JpaRepository<User,Long> {
    /*
    * 我们在这里直接继承 JpaRepository
    * 这里面已经有很多现场的方法了
    * 这也是JPA的一大优点
    *
    * */
}
