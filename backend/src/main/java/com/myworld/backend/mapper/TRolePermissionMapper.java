package com.myworld.backend.mapper;

import com.myworld.backend.model.TRolePermission;

/**
* @author 陈。。。
* @description 针对表【t_role_permission(角色权限关系表)】的数据库操作Mapper
* @createDate 2024-04-13 18:01:28
* @Entity com.myworld.backend.model.TRolePermission
*/
public interface TRolePermissionMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TRolePermission record);

    int insertSelective(TRolePermission record);

    TRolePermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TRolePermission record);

    int updateByPrimaryKey(TRolePermission record);

}
