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
 *
 * </p>
 *
 * @author NJAU-张文军
 * @since 2019-07-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Traveller extends Model<Traveller> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("name")
    private String name;

    @TableField("phoneNum")
    private String phoneNum;

    @TableField("credentialsType")
    private Integer credentialsType;

    @TableField("credentialsNum")
    private String credentialsNum;

    @TableField("travellerType")
    private Integer travellerType;

    @TableField("sex")
    private String sex;

    @TableField(exist = false)
    private List<Orders> orders;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
