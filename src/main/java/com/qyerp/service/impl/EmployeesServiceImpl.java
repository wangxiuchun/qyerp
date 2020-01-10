package com.qyerp.service.impl;
import com.qyerp.dao.EmployeesDao;
import com.qyerp.entity.Employees;
import com.qyerp.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeesServiceImpl implements EmployeesService {

    @Autowired
    private EmployeesDao employeesDao;

    @Override
    public Employees login(Employees employees) {
        return employeesDao.login(employees);
    }
}