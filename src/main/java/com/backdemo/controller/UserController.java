package com.backdemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.backdemo.entity.User;
import com.backdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/find_User",method= RequestMethod.GET)
    @ResponseBody
    public Object list(){
        // 找到预备选手
        List<User> user = userService.getUser();
        //String s = JSON.toJSONString(candidate);
        JSONObject obj=new JSONObject();
        //前台通过key值获得对应的value值
        obj.put("code", 0);
        obj.put("msg", "");
        obj.put("count",1000);
        obj.put("data",user);
        return obj.toJSONString();

    }
    @RequestMapping("/del")
    @ResponseBody
    public int del(int uid){
        //删除候选歌手
        int i=userService.delUser(uid);
        System.out.println("======"+uid);
        return i;
    }
}
