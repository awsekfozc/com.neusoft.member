package com.neusoft.member.dao;

import com.neusoft.base.vo.BaseVo;

/**
 * Created by zhengcheng on 2017/3/24.
 */
public interface UserDao<T extends BaseVo>{

    /****
     * 根据用户名获取用户
     * @param userNamess:用户名
     * @return
     */
    public T getUser(String userNamess);

}
