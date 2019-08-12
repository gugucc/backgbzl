package com.backdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class ViewController {

    @RequestMapping("index")
    public ModelAndView index(){
        ModelAndView mv=new ModelAndView("/index");
        return mv;
    }

    @RequestMapping("welcome")
    public ModelAndView welcome(){
        ModelAndView mv=new ModelAndView("/welcome");
        return mv;
    }

    @RequestMapping("admin-add")
    public ModelAndView adminadd(){
        ModelAndView mv=new ModelAndView("/admin-add");
        return mv;
    }

    @RequestMapping("admin-list")
    public ModelAndView adminlist(){
        ModelAndView mv=new ModelAndView("/admin-list");
        return mv;
    }


    @RequestMapping("error")
    public ModelAndView error(){
        ModelAndView mv=new ModelAndView("/error");
        return mv;
    }

    @RequestMapping("login")
    public ModelAndView login(){
        ModelAndView mv=new ModelAndView("/login");
        return mv;
    }



    @RequestMapping("user-list")
    public ModelAndView userlist(){
        ModelAndView mv=new ModelAndView("user-list");
        return mv;
    }

    @RequestMapping("vote-add")
    public ModelAndView voteadd(){
        ModelAndView mv=new ModelAndView("vote-add");
        return mv;
    }

    @RequestMapping("blog-list")
    public ModelAndView bloglist(){
        ModelAndView mv=new ModelAndView("blog-list");
        return mv;
    }


    @RequestMapping("welcome1")
    public ModelAndView welcome1(){
        ModelAndView mv=new ModelAndView("/welcome1");
        return mv;
    }

    @RequestMapping("echarts4")
    public ModelAndView echarts4(){
        ModelAndView mv=new ModelAndView("/echarts4");
        return mv;
    }

    @RequestMapping("user-add")
    public ModelAndView useradd(){
        ModelAndView mv=new ModelAndView("user-add");
        return mv;
    }

    @RequestMapping("blog-add")
    public ModelAndView blog_add(){
        ModelAndView mv=new ModelAndView("/blog-add");
        return mv;
    }

    @RequestMapping("singer-add")
    public String singeradd(int d_id, Model model){
        System.out.println("======"+d_id);
        model.addAttribute("d_id",d_id);
        return "singer-add";
    }

}
