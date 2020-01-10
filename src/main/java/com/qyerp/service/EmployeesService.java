package com.qyerp.service;

import com.qyerp.entity.Employees;
import org.springframework.stereotype.Service;

@Service
public interface EmployeesService {

    public Employees login(Employees employees);

}