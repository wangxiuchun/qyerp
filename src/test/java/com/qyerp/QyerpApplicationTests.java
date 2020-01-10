package com.qyerp;

import com.qyerp.dao.EmployeesDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class QyerpApplicationTests {
    @Resource
    private EmployeesDao employeesDao;
//    @Test
//    void contextLoads(int id) {
//        employeesDao.queryById(1);
//        System.out.println(employeesDao.queryById(1));
//    }

}
