package com.qyerp.dao;

import com.qyerp.entity.Employees;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface EmployeesDao {

    @Select("select userCode,password from base_user where userCode=#{userCode} and password=#{password}")
    public Employees login(Employees employees);

}