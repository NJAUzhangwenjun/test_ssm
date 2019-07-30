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
 * 角色表
 * </p>
 *
 * @author NJAU-张文军
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Role extends Model<Role> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 角色名
     */
    @TableField("roleName")
    private String roleName;

    /**
     * 角色描述
     */
    @TableField("roleDesc")
    private String roleDesc;

    @TableField(exist = false)
    private List<Users> users;


    @TableField(exist = false)
    private List<Permission> permissions;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
