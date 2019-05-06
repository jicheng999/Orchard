package pers.hc.orchard.blog.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by liujicheng on 2018/11/16.
 */
@Data
public class Demo {
    private Long id;
    private Date creTime;
    private Date modifyTime;
    private Integer status;
    private String username;
    private String address;
    private Integer age;
}
