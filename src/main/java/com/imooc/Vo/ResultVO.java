package com.imooc.Vo;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * @Auther: Leo
 * @Date: 2018/8/17 20:56
 * @Description:
 */
@Data
public class ResultVO<T> {

    //错误码
    private Integer code;

    //提示信息
    private String msg;

    //具体内容
    private  T data;

}

