package com.myworld.backend.mapper;

import com.myworld.backend.model.TClue;

/**
* @author 陈。。。
* @description 针对表【t_clue(线索表)】的数据库操作Mapper
* @createDate 2024-04-13 18:01:28
* @Entity com.myworld.backend.model.TClue
*/
public interface TClueMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TClue record);

    int insertSelective(TClue record);

    TClue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TClue record);

    int updateByPrimaryKey(TClue record);

}
