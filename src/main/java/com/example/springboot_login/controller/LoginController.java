package com.example.springboot_login.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;

@Controller
@RequestMapping("/")
public class LoginController {
    @PostMapping("login")
    public String login(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("login_flag", true);
        return "redirect:top";
    }

    @PostMapping("logout")
    public String  logout(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        return "redirect:top";
    }
}
