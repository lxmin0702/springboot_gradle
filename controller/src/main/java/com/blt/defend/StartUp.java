package com.blt.defend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author by lxmin
 * @create 2021-04-13
 * @E-mail 294900038@qq.com
 */
@Controller
@SpringBootApplication(scanBasePackages= {"com.blt.defend.controller", "com.blt.service", "com.blt.mapper"})
@MapperScan("com.blt.mapper")
public class StartUp {
    public static void main(String[] args) {
        SpringApplication.run(StartUp.class, args);
    }

    @ResponseBody
    @GetMapping("/")
    public String hello() {
        return "Hello World!" + com.blt.common.test.test();
    }
}
