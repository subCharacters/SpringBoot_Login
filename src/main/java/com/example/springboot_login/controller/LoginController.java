package com.example.springboot_login.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;

@Controller
@RequestMapping("/")
public class LoginController {
    @PostMapping("login")
    public String login(RedirectAttributes redirectAttributes) throws IOException {
        redirectAttributes.addFlashAttribute("login_flag", true);
        return "redirect:top";
    }
}
