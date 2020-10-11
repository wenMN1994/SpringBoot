package com.dragon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author：Dragon Wen
 * @email：18475536452@163.com
 * @date：Created in 2019/9/11 16:15
 * @description：controller
 * @modified By：
 * @version: $
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "HelloWorld...";
    }
}
