package com.njau.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.njau.entity.Permission;
import com.njau.entity.Role;
import com.njau.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <p>
 * 角色表 前端控制器
 * </p>
 *
 * @author NJAU-张文军
 * @since 2019-07-29
 */
@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    /**
     * 分页查询
     *
     * @param model
     * @param page
     * @param size
     * @return
     */
    @RequestMapping("findAll.do")
    public String findAll(Model model, @RequestParam(name = "page", defaultValue = "1") int page, @RequestParam(name = "size", defaultValue = "4") int size) {

        IPage<Role> page1 = roleService.page(new Page<Role>(page, size));
        model.addAttribute("page", page1);
        model.addAttribute("pages", page1.getPages());
        model.addAttribute("roleList", page1.getRecords());
        return "roleList";
    }


    /**
     * 根据id将role和未添加过的permission查询出来
     * @param id
     * @return
     */
    @RequestMapping("findRoleByIdAndAllPermission.do")
    public String findRoleByIdAndAllPermission(int id,Model model) {
        Role role = roleService.findRoleByIdAndAllPermission(id);
        List<Permission> permissionList = role.getPermissions();
        model.addAttribute("role", role);
        model.addAttribute("permissionList", permissionList);
        return "roleAddPermission";
    }

    /**
     * 根据id查询角色和其拥有的permission
     * @param id
     * @return
     */
    @RequestMapping("findById.do")
    public String findById(int id,Model model) {
        Role role = roleService.findById(id);
        model.addAttribute("role", role);
        return "roleShowAllPermission";
    }

    @RequestMapping("toAdd.do")
    public String toAdd() {
        return "roleAdd";
    }

    /**
     * 添加
     * @param role
     * @return
     */
    @RequestMapping("save.do")
    public String save(Role role) {
        roleService.save(role);
        return "redirect:findAll.do";
    }

    /**
     * 为角色添加权限
     * @param roleId
     * @param permissionIds
     * @return
     */
    @RequestMapping("addPermissionToRole.do")
    public String addPermissionToRole(int roleId, @RequestParam(name = "ids") int[] permissionIds) {
        roleService.addPermissionToRole(roleId,permissionIds);
        return "redirect:findAll.do";
    }


}

