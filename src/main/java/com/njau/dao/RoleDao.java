package com.njau.dao;

import com.njau.entity.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 角色表 Mapper 接口
 * </p>
 *
 * @author NJAU-张文军
 * @since 2019-07-29
 */
public interface RoleDao extends BaseMapper<Role> {

    Role findRoleByIdAndAllPermission(int id) ;

    void addPermissionToRole(@Param("roleId") int roleId,@Param("permissionId") int permissionId);

    Role findById(int id);
}
