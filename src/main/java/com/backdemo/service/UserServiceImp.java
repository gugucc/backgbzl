package com.backdemo.service;

import com.backdemo.dao.UserDao;
import com.backdemo.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImp implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public void uploadImages(User user) {
        userDao.uploadImages(user);
    }

    @Override
    public List<User> getUser() {
        return userDao.getUser();
    }

    @Override
    public int delUser(int uid) {
        return userDao.delUser(uid);
    }
}
