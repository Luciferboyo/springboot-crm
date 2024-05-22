package com.myworld.backend.mapper;

import com.myworld.backend.model.TRole;

/**
* @author 陈。。。
* @description 针对表【t_role(角色表)】的数据库操作Mapper
* @createDate 2024-04-13 18:01:28
* @Entity com.myworld.backend.model.TRole
*/
public interface TRoleMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TRole record);

    int insertSelective(TRole record);

    TRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TRole record);

    int updateByPrimaryKey(TRole record);

}
