package com.njau.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.njau.dao.OrdersDao;
import com.njau.entity.Orders;
import com.njau.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author NJAU-张文军
 * @since 2019-07-28
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersDao, Orders> implements OrdersService {


    @Autowired
    private OrdersDao ordersDao;

    @Override
    public List<Orders> findAll() {

        return ordersDao.findAll();

    }

    @Override
    public Page<Orders> findAllPage(Page<Orders> page) {
        return ordersDao.findAllPage(page);
    }

    @Override
    public Orders findById(int id) {
        return ordersDao.findById(id);
    }


}
