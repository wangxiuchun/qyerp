package com.qyerp;

import com.qyerp.dao.ErpSysUserDao;
import com.qyerp.entity.ErpSysUser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class QyerpApplicationTests {
    @Resource
    private ErpSysUserDao erpSysUserDao;
    @Test
    void contextLoads(int id) {
        erpSysUserDao.queryById(1);
        System.out.println(erpSysUserDao.queryById(1));
    }

}
