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

/**
 * <p>
 * 产品
 * </p>
 *
 * @author NJAU-张文军
 * @since 2019-07-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Product extends Model<Product> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 产品编号，唯一，不为空
     */
    @TableField("productNum")
    private String productNum;

    /**
     * 产品名称（路线名称）
     */
    @TableField("productName")
    private String productName;

    /**
     * 出发城市
     */
    @TableField("cityName")
    private String cityName;

    /**
     * 出发时间
     */
    @TableField("departureTime")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime departureTime;

    /**
     * 产品价格
     */
    @TableField("productPrice")
    private Float productPrice;

    /**
     * 产品描述
     */
    @TableField("productDesc")
    private String productDesc;

    /**
     * 状态(0 关闭 1 开启)
     */
    @TableField("productStatus")
    private Integer productStatus;

    @TableField(exist = false)
    private String productStatusStr;

    @TableField(exist = false)
    private Orders orders;

    public String getProductStatusStr() {
        if (productStatus == 0) {
            this.productStatusStr = "关闭";
        } else {
            this.productStatusStr = "开启";
        }
        return productStatusStr;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
