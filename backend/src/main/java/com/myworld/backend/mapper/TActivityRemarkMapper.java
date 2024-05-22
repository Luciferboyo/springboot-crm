package com.myworld.backend.mapper;

import com.myworld.backend.model.TActivityRemark;

/**
* @author 陈。。。
* @description 针对表【t_activity_remark(市场活动备注表)】的数据库操作Mapper
* @createDate 2024-04-13 18:01:28
* @Entity com.myworld.backend.model.TActivityRemark
*/
public interface TActivityRemarkMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TActivityRemark record);

    int insertSelective(TActivityRemark record);

    TActivityRemark selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TActivityRemark record);

    int updateByPrimaryKey(TActivityRemark record);

}
