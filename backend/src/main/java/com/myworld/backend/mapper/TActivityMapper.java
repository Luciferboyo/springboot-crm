package com.myworld.backend.mapper;

import com.myworld.backend.model.TActivity;

/**
* @author 陈。。。
* @description 针对表【t_activity(市场活动表)】的数据库操作Mapper
* @createDate 2024-04-13 18:01:28
* @Entity com.myworld.backend.model.TActivity
*/
public interface TActivityMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TActivity record);

    int insertSelective(TActivity record);

    TActivity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TActivity record);

    int updateByPrimaryKey(TActivity record);

}
