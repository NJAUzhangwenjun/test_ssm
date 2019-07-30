package com.njau.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.njau.dao.UsersDao;
import com.njau.entity.Users;
import com.njau.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author NJAU-张文军
 * @since 2019-07-27
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersDao, Users> implements UsersService {


    @Autowired
    private UsersDao usersDao;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    /**
     * 添加用户，加密密码
     * @param users
     */
    @Override
    public void mysave(Users users) {
        String password = bCryptPasswordEncoder.encode(users.getPassword());
        users.setPassword(password);
        usersDao.insert(users);
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @Override
    public Users findById(int id) {
        return usersDao.findById(id);
    }

    @Override
    public Users findUserByIdAndAllRole(int id) {
        Users users = usersDao.findUserByIdAndAllRole(id);
        return users;
    }

    /**
     * 给用户添加角色
     * @param roleIds
     */
    @Override
    public void addRoleToUser(int userId,int[] roleIds) {
        for (int roleId : roleIds) {
            usersDao.addRoleToUser(userId, roleId);
        }
    }
}
