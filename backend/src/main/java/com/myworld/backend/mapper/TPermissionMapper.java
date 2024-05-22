package com.myworld.backend.mapper;

import com.myworld.backend.model.TPermission;

/**
* @author 陈。。。
* @description 针对表【t_permission(权限表)】的数据库操作Mapper
* @createDate 2024-04-13 18:01:28
* @Entity com.myworld.backend.model.TPermission
*/
public interface TPermissionMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TPermission record);

    int insertSelective(TPermission record);

    TPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TPermission record);

    int updateByPrimaryKey(TPermission record);

}
