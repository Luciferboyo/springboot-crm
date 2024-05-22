package com.myworld.backend.mapper;

import com.myworld.backend.model.TDicType;

/**
* @author 陈。。。
* @description 针对表【t_dic_type(字典类型表)】的数据库操作Mapper
* @createDate 2024-04-13 18:01:28
* @Entity com.myworld.backend.model.TDicType
*/
public interface TDicTypeMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TDicType record);

    int insertSelective(TDicType record);

    TDicType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TDicType record);

    int updateByPrimaryKey(TDicType record);

}
