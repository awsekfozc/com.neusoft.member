package com.neusoft.member.persistence.auto.mapper;

import com.neusoft.common.service.BaseSeviceMybatis;
import com.neusoft.member.persistence.auto.model.UserInfoEntity;

public interface UserInfoEntityMapper extends BaseSeviceMybatis {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfoEntity record);

    int insertSelective(UserInfoEntity record);

    UserInfoEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfoEntity record);

    int updateByPrimaryKey(UserInfoEntity record);
}