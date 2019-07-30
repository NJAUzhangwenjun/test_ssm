package com.njau.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.njau.entity.Orders;
import com.njau.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author NJAU-张文军
 * @since 2019-07-28
 */
@Controller
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    /**
     * 查询所有
     *
     * @param model
     * @return
     */
    @RequestMapping("findAll.do")
    public String findAll(Model model) {
        List<Orders> ordersList = ordersService.findAll();
        model.addAttribute("ordersList", ordersList);
        return "orderList";
    }

    /**
     * 分页查询
     *
     * @param model
     * @return
     */
    @RequestMapping("findAllPage.do")
    public String findAll1(Model model,
                           @RequestParam(name = "page", required = true, defaultValue = "1") int curent,
                           @RequestParam(name = "size", required = true, defaultValue = "4") int size) {

        Page<Orders> page = new Page<>(curent, size);
        Page<Orders> productVoPage = ordersService.findAllPage(page);
        long pages = productVoPage.getPages();
        model.addAttribute("pages", pages);
        model.addAttribute("page", productVoPage);
        return "orderList";
    }

    /**
     * 根据id查询所有信息
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("findById.do")
    public String findById(Model model, @RequestParam(name = "id", required = true) int id) {

        Orders orders = ordersService.findById(id);
        model.addAttribute("orders", orders);
        return "ordersShow";
    }


}

