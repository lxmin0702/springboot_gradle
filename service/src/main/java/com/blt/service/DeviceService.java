package com.blt.service;

import com.blt.entity.Device;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author by lxmin
 * @create 2021-04-15
 * @E-mail 294900038@qq.com
 */
public interface DeviceService {
    List<Device> findAll();

    PageInfo<Device> findAllByPage(int page, int offset);
}
