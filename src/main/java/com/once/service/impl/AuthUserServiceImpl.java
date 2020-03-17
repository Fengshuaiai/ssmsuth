package com.once.service.impl;

import com.once.dao.IAuthUserDao;
import com.once.pojo.AuthUser;
import com.once.service.IAuthUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class AuthUserServiceImpl implements IAuthUserService {
    @Resource
    private IAuthUserDao authUserDao;
    /**
     * 查询AuthUser获取session值
     * @param authUser
     * @return
     */
    @Override
    public AuthUser getAuthUser(AuthUser authUser) {
        return authUserDao.getAuthUser(authUser);
    }
}
