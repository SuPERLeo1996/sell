package com.imooc.Vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Auther: Leo
 * @Date: 2018/8/17
 * @Description:商品详情
 */

@Data
public class ProductInfoVO {
    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("descriptiom")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;
}
