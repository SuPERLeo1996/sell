package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * @Auther: Leo
 * @Date: 2018/8/19
 * @Description:
 */
public class SellException extends RuntimeException {
    private Integer code;

    public SellException(Integer code,String message) {
        super(message);
        this.code = code;
    }

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }
}
