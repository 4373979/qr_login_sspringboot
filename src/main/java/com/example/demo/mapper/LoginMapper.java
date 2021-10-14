package com.example.demo.mapper;

import com.example.demo.entity.Login;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {
    /*
 *  用户登录
 *  @Param("userName") 用户账号信息
     根据userName查找用户信息对比账号是否注册如存此账号证明已注册
     则根据用户前台输入的密码与数据库密码进行对比
  * */
    @Select("SELECT * FROM t_user WHERE username=#{username}")
    Login getLogin(@Param("username") String username);

    @Select("select * from t_user where username = #{login.username} and  password = #{login.password}")
    Login toLogin(@Param("login") Login login);
}
