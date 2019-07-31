package com.njau.service.impl;

import com.njau.entity.Role;
import com.njau.dao.RoleDao;
import com.njau.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author NJAU-张文军
 * @since 2019-07-29
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleDao, Role> implements RoleService {
    @Autowired
    private RoleDao roleDao;

    @Override
    public Role findRoleByIdAndAllPermission(int id) {

        return roleDao.findRoleByIdAndAllPermission(id);
    }

    @Override
    public void addPermissionToRole(int roleId, int[] permissionIds) {
        for (int permissionId : permissionIds) {
            roleDao.addPermissionToRole(roleId, permissionId);
        }
    }

    @Override
    public Role findById(int id) {
        return roleDao.findById(id);
    }

}
