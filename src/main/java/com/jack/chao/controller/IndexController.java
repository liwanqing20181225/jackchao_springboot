package com.jack.chao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller
public class IndexController {
//    @RequestMapping("/info")
//    public String init(HttpServletRequest request, @RequestParam(value = "name",defaultValue = "lichao") String name) {
//        request.setAttribute("name", name);
//        return "index";
//    }
@RequestMapping("/info")
public String init(HttpServletRequest request, @RequestParam(value = "name",defaultValue = "lichao") String name) {
    request.setAttribute("name", name);
    return "index";
}
}
