package com.blt.test;


import java.util.List;

import com.blt.common.Result;
import com.blt.defend.StartUp;
import com.blt.entity.Device;
import com.blt.mapper.DeviceMapper;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = StartUp.class)
public class TestMybatis {
    @Autowired
    private DeviceMapper deviceMapper;

    @Test
    public void test(){
        System.out.println(111);
        try {
//            List<Device> list = deviceMapper.findAll();
            Device device = deviceMapper.findById("00006d8857a811ea83b70050568971c6");
//            System.out.println(list.size());
            System.out.println(device.toString());

            Result result = new Result(true,"");
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}