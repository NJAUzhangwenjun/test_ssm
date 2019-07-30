package com.njau.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.njau.entity.Users;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author NJAU-张文军
 * @since 2019-07-27
 */
public interface UsersService extends IService<Users> {

    void mysave(Users users);

    Users findById(int id);

    Users findUserByIdAndAllRole(int id);

    void addRoleToUser(int userid,int[] roleIds);
}
