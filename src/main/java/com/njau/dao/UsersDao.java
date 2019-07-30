package com.njau.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.njau.entity.Users;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author NJAU-张文军
 * @since 2019-07-29
 */
public interface UsersDao extends BaseMapper<Users> {

    Users selectUsersByUsername(String username);

    Users findById(int id);

    Users findUserByIdAndAllRole(int id);

    void addRoleToUser(@Param("userId") int userId ,@Param("roleId") int roleId);
}
