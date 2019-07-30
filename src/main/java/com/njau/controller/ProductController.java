package com.njau.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.njau.entity.Product;
import com.njau.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <p>
 * 产品 前端控制器
 * </p>
 *
 * @author NJAU-张文军
 * @since 2019-07-27
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;


    /**
     * 查询并跳转到相应的页面展示
     * @param model
     * @return
     */
    @RequestMapping("productList.do")
    private String productList(Model model) {
        QueryWrapper<Product> queryWrapper = new QueryWrapper<>();
        Page<Product> page = new Page<>(1, 4);
        IPage<Product> productIPage = productService.page(page, queryWrapper);
        List<Product> list = productIPage.getRecords();
        model.addAttribute("productList", list);
        return "tbList";
    }

    /**
     *
     * @return
     */
    @RequestMapping("addProduct.do")
    private String addProduct() {
        return "tbAdd";
    }

    /**
     *
     * @return
     */
    @RequestMapping("save.do")
    private String save(Product product) {
        boolean save = productService.save(product);
        return "redirect:productList.do";
    }
}

