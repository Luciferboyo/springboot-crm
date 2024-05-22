package com.myworld.backend.mapper;

import com.myworld.backend.model.TDicValue;

/**
* @author 陈。。。
* @description 针对表【t_dic_value(字典值表)】的数据库操作Mapper
* @createDate 2024-04-13 18:01:28
* @Entity com.myworld.backend.model.TDicValue
*/
public interface TDicValueMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TDicValue record);

    int insertSelective(TDicValue record);

    TDicValue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TDicValue record);

    int updateByPrimaryKey(TDicValue record);

}
