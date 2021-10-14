package com.example.demo.mapper;

import com.example.demo.entity.Login;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.mapping.StatementType;

@Mapper
public interface RegisterMapper {

    @Select("insert into t_user (username,password) values (#{login.username}, #{login.password})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID() AS id", keyProperty = "login.id",statementType= StatementType.STATEMENT,before = false, resultType = Integer.class)
    Integer toRegister(@Param("login") Login login);
}
