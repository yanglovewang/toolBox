package com.yang.middleware.dao;

import com.yang.middleware.bean.User;
import org.apache.ibatis.annotations.Select;
 
import java.util.List;
 
public interface UserMapper {
    /**
     * 获取所有user
     *
     * @return 所有user
     */
 
    @Select(value = "select * from user")
    List<User> getAllUser();
 
    /**
     * 根据用户id获取用户信息
     *
     * @param id 用户ID
     * @return 用户
     */
    @Select(value = "select * from user where id = #{id}")
    User getUserById(Integer id);
}
