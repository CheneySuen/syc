package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface
UserMapper {
    User selectById(int id);

    User selectByName(String username);

    int updateHeader(int id, String headerUrl);
}
