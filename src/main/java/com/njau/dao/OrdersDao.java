package com.njau.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.njau.entity.Orders;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author NJAU-张文军
 * @since 2019-07-28
 */
public interface OrdersDao extends BaseMapper<Orders> {

    List<Orders> findAll();


    /**
     * 分页查询
     * */
    Page<Orders> findAllPage(Page<Orders> page);

    /**
     * 根据id查询所有
     * @param id
     * @return
     */
    Orders findById(int id);
}
