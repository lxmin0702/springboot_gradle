package com.blt.defend.controller;

import com.blt.common.Result;
import com.blt.entity.Device;
import com.blt.service.DeviceService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author by lxmin
 * @create 2021-04-15
 * @E-mail 294900038@qq.com
 */
@RestController
@RequestMapping("/device")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @RequestMapping("/deviceList")
    public List<Device> list() {
        return deviceService.findAll();
    }

    @RequestMapping("/devicePage")
    public Result<PageInfo<Device>> findAllPage(@RequestParam(value = "page",required = true) int page,
                                               @RequestParam(value = "offset",required = true) int offset){
        return new Result<>(true,"",deviceService.findAllByPage(page, offset));
    }
}
