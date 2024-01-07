package com.example.springboot_login.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class TopController {
    @GetMapping(value = {"", "top"})
    public String top(HttpServletRequest request, Model model, @ModelAttribute String login_flag) {
        boolean flag = model.getAttribute("login_flag") != null ? (boolean) model.getAttribute("login_flag") : false;
        model.addAttribute("login_flag", flag);
        return "top";
    }
}
