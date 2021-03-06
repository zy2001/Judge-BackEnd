package com.openjudge.backend.Domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by zy on 2020/1/29
 */

@Data
public class Submit {
    private Integer rid;
    private Integer pid;
    private Integer uid;
    private String code;
    private String language;
    private Integer status;
    private Integer runTime;
    private Integer runMemory;
    private String compilationMessage;
    private Date gmtCreated;
    private Date gmtModified;

}
