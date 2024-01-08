package com.example.springboot_login.controller;

import com.example.springboot_login.entity.Members;
import com.example.springboot_login.service.MembersService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;

@Controller
@RequestMapping("/")
public class LoginController {

    private MembersService membersService;

    @Autowired
    LoginController(MembersService membersService) {
        this.membersService = membersService;
    }

    @PostMapping("login")
    public String login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Cookie cookie = null;
        if (membersService.checkUsername(request.getParameter("username"))) {
            cookie = new Cookie("login_flag", "true");
            response.addCookie(cookie);
        }
        return "redirect:top";
    }
}
