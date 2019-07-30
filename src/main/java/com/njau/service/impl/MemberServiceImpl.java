package com.njau.service.impl;

import com.njau.entity.Member;
import com.njau.dao.MemberDao;
import com.njau.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author NJAU-张文军
 * @since 2019-07-27
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberDao, Member> implements MemberService {

}
