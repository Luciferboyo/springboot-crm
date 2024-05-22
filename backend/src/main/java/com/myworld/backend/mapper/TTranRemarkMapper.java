package com.myworld.backend.mapper;

import com.myworld.backend.model.TTranRemark;

/**
* @author 陈。。。
* @description 针对表【t_tran_remark(交易跟踪记录表)】的数据库操作Mapper
* @createDate 2024-04-13 18:01:29
* @Entity com.myworld.backend.model.TTranRemark
*/
public interface TTranRemarkMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TTranRemark record);

    int insertSelective(TTranRemark record);

    TTranRemark selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TTranRemark record);

    int updateByPrimaryKey(TTranRemark record);

}
