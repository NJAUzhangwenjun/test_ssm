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
 * 资源权限表
 * </p>
 *
 * @author NJAU-张文军
 * @since 2019-07-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Permission extends Model<Permission> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 角色名
     */
    @TableField("permissionName")
    private String permissionName;

    /**
     * 资源路径
     */
    @TableField("url")
    private String url;

    @TableField(exist = false)
    private List<Role> roles;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
