package com.myworld.backend.mapper;

import com.myworld.backend.model.TUser;

/**
* @author 陈。。。
* @description 针对表【t_user(用户表)】的数据库操作Mapper
* @createDate 2024-04-13 18:01:29
* @Entity com.myworld.backend.model.TUser
*/
public interface TUserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);

}
