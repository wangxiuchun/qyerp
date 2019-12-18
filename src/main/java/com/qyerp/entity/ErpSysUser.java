package com.qyerp.entity;

import java.io.Serializable;

/**
 * (ErpSysUser)实体类
 *
 * @author makejava
 * @since 2019-12-18 20:42:01
 */
public class ErpSysUser implements Serializable {
    private static final long serialVersionUID = 675419090781099629L;
    
    private Integer id;
    
    private String username;
    
    private String password;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}