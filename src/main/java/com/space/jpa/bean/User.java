package com.space.jpa.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author zhuzhe
 * @date 2018/6/3 23:27
 * @email 1529949535@qq.com
 */
@Data
@Entity  // 该注解声明一个实体类，与数据库中的表对应
public class User {

    @Id   // 表明id
    @GeneratedValue   //  自动生成
    private Long id ;

    private String name ;
}
