package org.sheng.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sheng on 2018/9/15 上午2:44
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String index() {
        return "hello index";
    }
}
