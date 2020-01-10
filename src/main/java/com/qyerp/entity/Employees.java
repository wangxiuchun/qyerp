package com.qyerp.entity;

import java.io.Serializable;

//实体类
public class Employees implements Serializable {
    private static final long serialVersionUID = 675419090781099629L;
    
    private Integer id;
    private String userCode;
    private String username;
    private String password;
    private String phone;
    private Integer dept_id;
    private Integer role_id;

    public Employees() {
    }

    public Employees(Integer id,String userCode, String username, String password, String phone, Integer dept_id, Integer role_id) {
        this.id = id;
        this.userCode = userCode;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.dept_id = dept_id;
        this.role_id = role_id;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", userCode='" + userCode + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", dept_id=" + dept_id +
                ", role_id=" + role_id +
                '}';
    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
}