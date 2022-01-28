package com.atguigu.common.exception;

import com.atguigu.common.result.ResponseEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Title:
 * @Desription:
 * @Company:
 * @ClassName:BusinessException
 * @Author: laj
 * @CreateDate: 2022/1/27 21:46
 * @UpdateUser:
 * @Version:1.0
 */
@Data
@NoArgsConstructor
public class BusinessException extends RuntimeException{

    private Integer code;
    private String message;

    public BusinessException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public BusinessException(String message, Integer code) {
        this.code = code;
        this.message = message;
    }

    public BusinessException(String message, Integer code, Throwable cause) {
        super(cause);
        this.code = code;
        this.message = message;
    }

    public BusinessException(ResponseEnum responseEnum) {
        this.code = responseEnum.getCode();
        this.message = responseEnum.getMessage();
    }

    public BusinessException(ResponseEnum responseEnum, Throwable cause) {
        super(cause);
        this.code = responseEnum.getCode();
        this.message = responseEnum.getMessage();
    }

}
