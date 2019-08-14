package com.backdemo.service;

import com.backdemo.entity.Admin;

import java.util.List;

public interface AdminService  {
    Admin login(String adminName, String password);

    void add(Admin admin);

    List<Admin> showAdmin();

    Admin selectAdmin(int id);

    void upDate(Admin admin);

    void deleteAdmin(int id);

    List<Admin> souSou(String adminName);

}
