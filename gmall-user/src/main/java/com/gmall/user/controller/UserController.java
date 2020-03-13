package com.gmall.user.controller;


import com.gmall.user.bean.UmsMember;
import com.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUmsMembers")
    @ResponseBody
    public List<UmsMember> getUmsMembers()
    {
        return userService.getUmsMembers();
    }
}
