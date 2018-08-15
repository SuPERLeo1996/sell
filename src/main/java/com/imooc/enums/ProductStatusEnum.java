package com.imooc.enums;

import lombok.Getter;

/**
 * @Auther: Leo
 * @Date: 2018/8/14 21:20
 * @Description:商品状态
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架")
    ;

    private Integer code;

    private  String message;

    ProductStatusEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
