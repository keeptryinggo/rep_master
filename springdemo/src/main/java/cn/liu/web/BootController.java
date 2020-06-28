package cn.liu.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootController {
    @GetMapping("hello")
    public String hello(){
        return "hello world";
    }
}
