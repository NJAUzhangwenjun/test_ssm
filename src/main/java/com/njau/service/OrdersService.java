package com.njau.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.njau.entity.Orders;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author NJAU-张文军
 * @since 2019-07-28
 */
public interface OrdersService extends IService<Orders> {

    List<Orders> findAll();


    Page<Orders> findAllPage(Page<Orders> page);

    Orders findById(int id);
}
