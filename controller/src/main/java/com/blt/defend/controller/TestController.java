package com.blt.defend.controller;

import com.blt.entity.Device;
import com.blt.mapper.DeviceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author by lxmin
 * @create 2021-04-15
 * @E-mail 294900038@qq.com
 */
@Controller
public class TestController {
    @Autowired
    DeviceMapper deviceMapper;

    @RequestMapping("query")
    @ResponseBody
    public List<Device> findUserALl() {
        return this.deviceMapper.findAll();
    }
}
