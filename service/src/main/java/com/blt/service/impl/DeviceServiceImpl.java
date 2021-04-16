package com.blt.service.impl;

import com.blt.entity.Device;
import com.blt.mapper.DeviceMapper;
import com.blt.service.DeviceService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author by lxmin
 * @create 2021-04-15
 * @E-mail 294900038@qq.com
 */
@Service
public class DeviceServiceImpl implements DeviceService {
    @Autowired
    DeviceMapper deviceMapper;
    @Override
    public List<Device> findAll() {
        return deviceMapper.findAll();
    }

    @Override
    public PageInfo<Device> findAllByPage(int page, int offset) {
        PageHelper.startPage(page, offset);
        List<Device> all = deviceMapper.findAll();
        return new PageInfo<>(all);
    }
}
