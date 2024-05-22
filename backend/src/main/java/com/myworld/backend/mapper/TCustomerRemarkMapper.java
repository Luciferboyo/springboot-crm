package com.myworld.backend.mapper;

import com.myworld.backend.model.TCustomerRemark;

/**
* @author 陈。。。
* @description 针对表【t_customer_remark(客户跟踪记录表)】的数据库操作Mapper
* @createDate 2024-04-13 18:01:28
* @Entity com.myworld.backend.model.TCustomerRemark
*/
public interface TCustomerRemarkMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TCustomerRemark record);

    int insertSelective(TCustomerRemark record);

    TCustomerRemark selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TCustomerRemark record);

    int updateByPrimaryKey(TCustomerRemark record);

}
