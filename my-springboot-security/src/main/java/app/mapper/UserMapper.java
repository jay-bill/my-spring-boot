package app.mapper;

import org.apache.ibatis.annotations.Mapper;

import app.entity.User;

@Mapper
public interface UserMapper {
	User selectById(String id);
    User selectByUsername(String username);
}
