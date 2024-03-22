package com.DoAn.ChatCoffee.adminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class HomeAdmin {
    @GetMapping
    public String index(){
        return "admin/homeAdmin/index";
    }
}
