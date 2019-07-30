package com.njau.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author NJAU-张文军
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Users extends Model<Users> {

    private static final long serialVersionUID=1L;

    /**
     * 主键，自增长
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 非空，唯一
     */
    @TableField("email")
    private String email;

    /**
     * 用户名
     */
    @TableField("username")
    private String username;

    /**
     * 密码，加密
     */
    @TableField("password")
    private String password;

    /**
     * 电话
     */
    @TableField("phoneNum")
    private String phoneNum;

    /**
     * 状态0 未开启 1 开启
     */
    @TableField("status")
    private Integer status;

    @TableField(exist = false)
    private String statusStr;

    public String getStatusStr() {
        if (status != 0) {
            statusStr = "开启";
        } else {
            statusStr ="未开启";
        }
        return statusStr;
    }

    @TableField(exist = false)
    private List<Role> roles;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
