package com.once.service.impl;

import com.once.dao.IUserDao;
import com.once.pojo.User;
import com.once.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("userService")  
public class UserServiceImpl implements IUserService {
    @Resource  
    private IUserDao userDao;
    
    public User getUserById(int id) {
        return this.userDao.selectByPrimaryKey(id);
    }
    public User selectByNameAndWord(User user) {
        return this.userDao.selectByNameAndWord(user);
    }
  
}