package com.once.service;

import com.once.pojo.AuthUser;

public interface IAuthUserService {
    //这个是用户表的查询 用于设置session值
    AuthUser getAuthUser(AuthUser authUser);
}
