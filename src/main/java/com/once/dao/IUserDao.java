package com.once.dao;


import com.once.pojo.User;

public interface IUserDao {

    User selectByPrimaryKey(int id);
    User selectByNameAndWord(User user);
}