package com.njau.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.njau.entity.Users;
import com.njau.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author NJAU-张文军
 * @since 2019-07-29
 */
@Controller
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService usersService;


    /**
     * 查询所有,分页查询
     * @param model
     * @return
     */
    @RequestMapping("findAll.do")
    public String findAll(Model model,
                          @RequestParam(name = "page", defaultValue = "1") int curent,
                          @RequestParam(name = "size", defaultValue = "4") int size)  {
        Page<Users> page1 = new Page<>(curent, size);


        IPage<Users> page = usersService.page(page1);
        model.addAttribute("userList", page.getRecords());
        long pages = page.getPages();
        model.addAttribute("pages", pages);
        model.addAttribute("page", page);
        return "userList";
    }


    /**
     * 根据id查询 并得到所有未添加过的角色列表
     * @param id
     * @return
     */
    @RequestMapping("findUserByIdAndAllRole.do")
    public String findUserByIdAndAllRole(int id,Model model) {
        Users users = usersService.findUserByIdAndAllRole(id);
        model.addAttribute("user", users);
        return "userAddRole";
    }

    @RequestMapping("addRoleToUser.do")
    public String addRoleToUser(@RequestParam(name = "userId")int userId,@RequestParam(name = "ids") int[] roleIds) {
        usersService.addRoleToUser(userId,roleIds);
        return "redirect:findAll.do";
    }


    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping("findById.do")
    public String findById(int id,Model model) {
        Users users = usersService.findById(id);
        model.addAttribute("user", users);
        return "userShow";
    }


    /**
     * 添加用户
     * @return
     */
    @RequestMapping("save.do")
    public String save(Users users) {
        usersService.mysave(users);
        return "success";
    }


    /**
     * 跳转到添加用户页面
     * @return
     */
    @RequestMapping("toUserAdd.do")
    public String toUserAdd() {
        return "userAdd";
    }


    /**
     * 跳转到登录页面
     * @return
     */
    @RequestMapping("toLogin.do")
    public String toLogin() {
        return "login";
    }


    /**
     * 跳转到失败页面
     * @return
     */
    @RequestMapping("toFailer.do")
    public String toFailer() {
        return "failer";
    }
}

