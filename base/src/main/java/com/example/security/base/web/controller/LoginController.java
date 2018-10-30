package com.example.security.base.web.controller;

import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Sherman
 * created in 2018/10/30
 */
@Api(tags = "登录接口")
@Controller
public class LoginController {


    @ApiOperation("登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "登录名", dataTypeClass = String.class, required = true, defaultValue = "admin", paramType = "form"),
            @ApiImplicitParam(name = "password", value = "密码", dataTypeClass = String.class, required = true, type = "password", paramType = "form")
    })
    @ApiResponses(@ApiResponse(code = 200, message = "登录成功", response = LoginResponse.class))
    @PostMapping("/login")
    public void signUp() {

    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }
}
