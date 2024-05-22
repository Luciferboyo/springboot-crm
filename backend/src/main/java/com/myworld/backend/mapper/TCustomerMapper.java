package com.myworld.backend.mapper;

import com.myworld.backend.model.TCustomer;

/**
* @author 陈。。。
* @description 针对表【t_customer(客户表)】的数据库操作Mapper
* @createDate 2024-04-13 18:01:28
* @Entity com.myworld.backend.model.TCustomer
*/
public interface TCustomerMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TCustomer record);

    int insertSelective(TCustomer record);

    TCustomer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TCustomer record);

    int updateByPrimaryKey(TCustomer record);

}
