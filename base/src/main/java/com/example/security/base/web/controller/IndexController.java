package com.example.security.base.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Sherman
 * created in 2018/10/30
 */

@Controller
public class IndexController {

    @GetMapping("/admin")
    public String admin() {
        return "/admin";
    }

    @GetMapping(value = {"/", "/index"})
    public String index() {
        return "/index";
    }
}
