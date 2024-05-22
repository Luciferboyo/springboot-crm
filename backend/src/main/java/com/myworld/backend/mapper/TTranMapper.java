package com.myworld.backend.mapper;

import com.myworld.backend.model.TTran;

/**
* @author 陈。。。
* @description 针对表【t_tran(交易表)】的数据库操作Mapper
* @createDate 2024-04-13 18:01:29
* @Entity com.myworld.backend.model.TTran
*/
public interface TTranMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TTran record);

    int insertSelective(TTran record);

    TTran selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TTran record);

    int updateByPrimaryKey(TTran record);

}
