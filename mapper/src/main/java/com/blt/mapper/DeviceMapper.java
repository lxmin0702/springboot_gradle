package com.blt.mapper;

import com.blt.entity.Device;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author by lxmin
 * @create 2021-04-15
 * @E-mail 294900038@qq.com
 */
@Mapper
public interface DeviceMapper {
    Device findById(String id);

    List<Device> findAll();

}
