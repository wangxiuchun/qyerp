package com.qyerp.controller;

import com.qyerp.entity.ErpSysUser;
import com.qyerp.service.ErpSysUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ErpSysUser)表控制层
 *
 * @author makejava
 * @since 2019-12-18 20:42:04
 */
@RestController
@RequestMapping("erpSysUser")
public class ErpSysUserController {
    /**
     * 服务对象
     */
    @Resource
    private ErpSysUserService erpSysUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ErpSysUser selectOne(Integer id) {
        return this.erpSysUserService.queryById(id);
    }

}