package com.qyerp.controller;

import com.qyerp.entity.Employees;
import com.qyerp.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("qyerp")
public class EmployeesController {

    @Autowired
    private EmployeesService employeesService;

    @RequestMapping("login")
    @ResponseBody
    public String login(Employees employees, HttpSession session){
        Employees emp=employeesService.login(employees);
        session.setAttribute("emp",emp);
        if (emp!=null){
            return "true";
        }else {
            return "false";
        }
    }


}