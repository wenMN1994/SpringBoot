package com.dragon.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author：Dragon Wen
 * @email：18475536452@163.com
 * @date：Created in 2019/9/19 16:27
 * @description：
 * @modified By：
 * @version: $
 */
@Controller
public class IndexController {
    @RequestMapping("/execute")
    public String execute(Map<String, Object> map) {
        map.put("name", "DragonWen");
        // classpath:/templates/success.html
        return "success";
    }
}
