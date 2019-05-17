package com.jack.chao.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexCrontroller1 {
    @RequestMapping("/hello1")
    public String index() {
        return "index111111";
    }


//    @RequestMapping("/hello")
//    public String index(Model model) {
//        model.addAttribute("name","lichao");
//        return "index";
//    }
}
