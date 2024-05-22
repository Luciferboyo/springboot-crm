package com.myworld.backend.mapper;

import com.myworld.backend.model.TClueRemark;

/**
* @author 陈。。。
* @description 针对表【t_clue_remark(线索跟踪记录表)】的数据库操作Mapper
* @createDate 2024-04-13 18:01:28
* @Entity com.myworld.backend.model.TClueRemark
*/
public interface TClueRemarkMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TClueRemark record);

    int insertSelective(TClueRemark record);

    TClueRemark selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TClueRemark record);

    int updateByPrimaryKey(TClueRemark record);

}
