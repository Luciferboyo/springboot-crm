package com.myworld.backend.mapper;

import com.myworld.backend.model.TProduct;

/**
* @author 陈。。。
* @description 针对表【t_product(产品表)】的数据库操作Mapper
* @createDate 2024-04-13 18:01:28
* @Entity com.myworld.backend.model.TProduct
*/
public interface TProductMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TProduct record);

    int insertSelective(TProduct record);

    TProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TProduct record);

    int updateByPrimaryKey(TProduct record);

}
