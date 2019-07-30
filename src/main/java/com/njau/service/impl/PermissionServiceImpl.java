package com.njau.service.impl;

import com.njau.entity.Permission;
import com.njau.dao.PermissionDao;
import com.njau.service.PermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 资源权限表 服务实现类
 * </p>
 *
 * @author NJAU-张文军
 * @since 2019-07-29
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionDao, Permission> implements PermissionService {

}
