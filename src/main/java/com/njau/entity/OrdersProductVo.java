package com.njau.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/7/2816:28
 */
public class OrdersProductVo extends Orders {
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
            productStatusStr = "关闭";
        } else {
            productStatusStr = "开启";
        }
        return productStatusStr;
    }

}
