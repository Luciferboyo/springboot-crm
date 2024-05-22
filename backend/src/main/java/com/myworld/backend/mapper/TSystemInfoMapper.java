package com.myworld.backend.mapper;

import com.myworld.backend.model.TSystemInfo;

/**
* @author 陈。。。
* @description 针对表【t_system_info(系统信息表)】的数据库操作Mapper
* @createDate 2024-04-13 18:01:29
* @Entity com.myworld.backend.model.TSystemInfo
*/
public interface TSystemInfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TSystemInfo record);

    int insertSelective(TSystemInfo record);

    TSystemInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TSystemInfo record);

    int updateByPrimaryKey(TSystemInfo record);

}
