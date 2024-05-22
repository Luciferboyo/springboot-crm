package com.myworld.backend.mapper;

import com.myworld.backend.model.TTranHistory;

/**
* @author 陈。。。
* @description 针对表【t_tran_history(交易历史记录表)】的数据库操作Mapper
* @createDate 2024-04-13 18:01:29
* @Entity com.myworld.backend.model.TTranHistory
*/
public interface TTranHistoryMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TTranHistory record);

    int insertSelective(TTranHistory record);

    TTranHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TTranHistory record);

    int updateByPrimaryKey(TTranHistory record);

}
