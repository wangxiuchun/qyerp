package com.qyerp.service;

import com.qyerp.entity.ErpSysUser;
import java.util.List;

/**
 * (ErpSysUser)表服务接口
 *
 * @author makejava
 * @since 2019-12-18 20:42:03
 */
public interface ErpSysUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ErpSysUser queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ErpSysUser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param erpSysUser 实例对象
     * @return 实例对象
     */
    ErpSysUser insert(ErpSysUser erpSysUser);

    /**
     * 修改数据
     *
     * @param erpSysUser 实例对象
     * @return 实例对象
     */
    ErpSysUser update(ErpSysUser erpSysUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}