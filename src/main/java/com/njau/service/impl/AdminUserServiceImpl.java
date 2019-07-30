package com.njau.service.impl;

import com.njau.dao.UsersDao;
import com.njau.entity.Role;
import com.njau.entity.Users;
import com.njau.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 权限控制实体类
 * </p>
 *
 * @author NJAU-张文军
 * @since 2019-07-29
 */
@Service("adminUserService")
public class AdminUserServiceImpl implements AdminUserService {

    @Autowired
    private UsersDao usersDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = null;
        try {
            users = usersDao.selectUsersByUsername(username);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
//        User user = new User(users.getUsername(), "{noop}" + users.getPassword(), users.getStatus() != 0, true, true, true, getAuthority(users.getRoles()));
        User user = new User(users.getUsername(), users.getPassword(), users.getStatus() != 0, true, true, true, getAuthority(users.getRoles()));
        return user;
    }

    /**
     * 返回角色的集合，集合中是用户的角色信息
     *
     * @param roles 用户的角色信息
     * @return
     */
    public List<SimpleGrantedAuthority> getAuthority(List<Role> roles) {
        ArrayList<SimpleGrantedAuthority> authorityArrayList = new ArrayList<>();
        for (Role role : roles) {
            authorityArrayList.add(new SimpleGrantedAuthority("ROLE_" + role.getRoleName()));
        }
        return authorityArrayList;
    }
}
