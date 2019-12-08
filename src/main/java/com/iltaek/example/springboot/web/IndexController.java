package com.iltaek.example.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by iltaek on 2019/12/08 Blog : http://blog.iltaek.me Github : http://github.com/iltaek
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
