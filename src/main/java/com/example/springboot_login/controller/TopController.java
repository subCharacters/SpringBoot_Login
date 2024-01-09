package com.example.springboot_login.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
@RequestMapping("/")
public class TopController {
    @GetMapping(value = {"", "top"})
    public String top(HttpServletRequest request, Model model, @ModelAttribute String login_flag,
                      // 이렇게도 취득가능.
                      @SessionAttribute(name = "login_flag", required = false) String lf) {
        HttpSession session = request.getSession();
        boolean flag = session.getAttribute("login_flag") != null ? (boolean) session.getAttribute("login_flag") : false;
        System.out.println(lf);
        model.addAttribute("login_flag", flag);
        return "top";
    }
}
