package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RegisterMapper {

    @Select("insert into t_user (username,password) values (#{username}, #{password})")
    Integer toRegister(@Param("username") String username, @Param("password") String password);
}
