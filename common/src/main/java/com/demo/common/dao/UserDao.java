package com.demo.common.dao;


import com.demo.common.domain.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {
    void updateUser();

    void batchInsertUserData(@Param("userList")List<User> userList);
}
