package com.blt.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author by lxmin
 * @create 2021-04-15
 * @E-mail 294900038@qq.com
 */
@Data
public class Device {
    private String id;
    private String devName;
    private String devDescription;
    private int runningStatus;
    private int connectStatus;
    private Date connectTime;
    private String devIp;
    private String devSn;
}
