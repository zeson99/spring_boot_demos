package com.zz.mybatisquerydemo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.zz.mybatisquerydemo.entity.User;

@Mapper
public interface UserMapper {
	@Select("SELECT * FROM user WHERE id = #{id}")
	User findById(int id);
}
