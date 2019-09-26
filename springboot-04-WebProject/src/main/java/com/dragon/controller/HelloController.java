package com.dragon.controller;

import com.dragon.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author：Dragon Wen
 * @email：18475536452@163.com
 * @date：Created in 2019/9/20 16:01
 * @description：
 * @modified By：
 * @version: $
 */
@Controller
public class HelloController {
    @RequestMapping("/study")
    public String study(Map<String, Object> map, HttpServletRequest request) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("小梦", 1));
        userList.add(new User("小李", 2));
        userList.add(new User("小张", 1));
        map.put("userList", userList);
        // 1女, 2男
        map.put("sex", 1);
        map.put("man", 2);
        // th:text th:utext
        map.put("desc", "欢迎来到<h1>DragonWen个人中心<h1>");
        request.getSession().setAttribute("user", new User("小不点", 2));
        return "study";
    }
}
