package com.yang.middleware.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestDao {

    @Select("select user_id from company where id = #{id}")
    int selectUserId(@Param("id") int id);

    @Select("SELECT user.phone FROM USER inner JOIN company ON company.id = #{id} and company.user_id = user.id")
    String selectUserName(@Param("id") int id);


}
