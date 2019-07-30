package com.njau.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.njau.entity.Role;
import com.njau.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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


}

