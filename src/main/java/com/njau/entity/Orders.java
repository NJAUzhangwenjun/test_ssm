package com.njau.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author NJAU-张文军
 * @since 2019-07-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Orders extends Model<Orders> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("orderNum")
    private String orderNum;

    @TableField("orderTime")
    @DateTimeFormat(pattern = "yyyy-mm-dd HH:mm:ss")
    private LocalDateTime orderTime;

    @TableField("peopleCount")
    private Integer peopleCount;

    @TableField("orderDesc")
    private String orderDesc;

    @TableField("payType")
    private Integer payType;

    @TableField("orderStatus")
    private Integer orderStatus;

    @TableField("productId")
    private Integer productId;


    @TableField("memberId")
    private Integer memberId;

    @TableField(exist = false)
    private Member member;

    @TableField(exist = false)
    private Product product;

    @TableField(exist = false)
    private List<Traveller> travellers;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
