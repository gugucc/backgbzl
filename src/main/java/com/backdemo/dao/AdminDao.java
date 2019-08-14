package com.backdemo.dao;

import com.backdemo.entity.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminDao {
    Admin findadmin(@Param("adminName") String adminName, @Param("password") String password);

    void add(Admin admin);

    List<Admin> showAdmin();

    Admin selectAdmin(int id);

    void upDate(Admin admin);

    void deleteAdmin(int id);

    List<Admin> souSou(String username);
}
