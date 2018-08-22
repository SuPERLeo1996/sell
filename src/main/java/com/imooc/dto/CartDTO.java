package com.imooc.dto;

import lombok.Data;
/**
 * @Auther: Leo
 * @Date: 2018/8/19
 * @Description:
 */
@Data
public class CartDTO {

    //商品id
    private String productId;

    //数量
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
