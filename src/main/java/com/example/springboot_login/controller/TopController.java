package com.example.springboot_login.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TopController {
    @GetMapping(value = {"", "top"})
    public String top(Model model, @CookieValue(name = "login_flag", required = false) String login_flag) {
        boolean flag = login_flag != null ? Boolean.parseBoolean(login_flag) : false;
        model.addAttribute("login_flag", flag);
        return "top";
    }
}
