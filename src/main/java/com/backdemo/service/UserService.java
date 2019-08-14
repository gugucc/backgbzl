package com.backdemo.service;

import com.backdemo.entity.User;

import java.util.List;

public interface UserService {
    //上传图片
    void uploadImages(User user);
    //找到用戶
    List<User> getUser();
    //刪除用戶
    int delUser(int uid);
}
