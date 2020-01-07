package com.qyerp.service.impl;

import com.qyerp.entity.ErpSysUser;
import com.qyerp.dao.ErpSysUserDao;
import com.qyerp.service.ErpSysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ErpSysUser)表服务实现类
 *
 * @author makejava
 * @since 2019-12-18 20:42:04
 */
@Service
public class ErpSysUserServiceImpl implements ErpSysUserService {
    @Resource
    private ErpSysUserDao erpSysUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ErpSysUser queryById(Integer id) {
        return this.erpSysUserDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ErpSysUser> queryAllByLimit(int offset, int limit) {
        return this.erpSysUserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param erpSysUser 实例对象
     * @return 实例对象
     */
    @Override
    public ErpSysUser insert(ErpSysUser erpSysUser) {
        this.erpSysUserDao.insert(erpSysUser);
        return erpSysUser;
    }

    /**
     * 修改数据
     *
     * @param erpSysUser 实例对象
     * @return 实例对象
     */
    @Override
    public ErpSysUser update(ErpSysUser erpSysUser) {
        this.erpSysUserDao.update(erpSysUser);
        return this.queryById(erpSysUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.erpSysUserDao.deleteById(id) > 0;
    }
}