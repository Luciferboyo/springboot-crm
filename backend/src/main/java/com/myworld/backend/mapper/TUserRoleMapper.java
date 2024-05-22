package com.myworld.backend.mapper;

import com.myworld.backend.model.TUserRole;

/**
* @author 陈。。。
* @description 针对表【t_user_role(用户角色关系表)】的数据库操作Mapper
* @createDate 2024-04-13 18:01:29
* @Entity com.myworld.backend.model.TUserRole
*/
public interface TUserRoleMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TUserRole record);

    int insertSelective(TUserRole record);

    TUserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TUserRole record);

    int updateByPrimaryKey(TUserRole record);

}
