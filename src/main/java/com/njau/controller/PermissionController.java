package com.njau.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.njau.entity.Permission;
import com.njau.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 * 资源权限表 前端控制器
 * </p>
 *
 * @author NJAU-张文军
 * @since 2019-07-29
 */
@Controller
@RequestMapping("/permission")
public class PermissionController {
    @Autowired
    private PermissionService permissionService;

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

        IPage<Permission> page1 = permissionService.page(new Page<Permission>(page, size));
        model.addAttribute("page", page1);
        model.addAttribute("pages", page1.getPages());
        model.addAttribute("permissionList", page1.getRecords());
        return "permissionList";
    }

    @RequestMapping("toAdd.do")
    public String toAdd() {
        return "permissionAdd";
    }

    /**
     * 添加
     * @param permission
     * @return
     */
    @RequestMapping("save.do")
    public String save(Permission permission) {
        permissionService.save(permission);
        return "redirect:findAll.do";
    }
}

