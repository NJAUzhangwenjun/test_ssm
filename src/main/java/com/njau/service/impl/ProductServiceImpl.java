package com.njau.service.impl;

import com.njau.entity.Product;
import com.njau.dao.ProductDao;
import com.njau.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品 服务实现类
 * </p>
 *
 * @author NJAU-张文军
 * @since 2019-07-27
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductDao, Product> implements ProductService {

}
