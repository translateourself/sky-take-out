package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

/**
 * @author xuxunne
 * @description:
 * @since 2024/12/29 17:44
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where openid = #{openId}")
    User getUserByOpenId(String openId);


    void insert(User user);

    @Select("select * from user where id = #{userid}")
    User getById(Long userId);

    Integer countByMap(Map map);
}
