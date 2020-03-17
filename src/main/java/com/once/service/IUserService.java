package com.once.service;


import com.once.pojo.User;

public interface IUserService {
     User getUserById(int id);
     User selectByNameAndWord(User user);

}