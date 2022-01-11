package com.huawei.data.exchange.platform.common.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * Dxp异常类
 */
@Getter
@Setter
public class DxpException extends RuntimeException {
    private String exceptionCode;

    /**
     * 构造方法
     */
    public DxpException() {
        super();
    }

    /**
     * 构造方法
     *
     * @param errorMsg
     *            错误信息
     */
    public DxpException(String errorMsg) {
        super(errorMsg);
    }

    /**
     * 构造方法
     *
     * @param throwable
     *            异常
     */
    public DxpException(Throwable throwable) {
        super(throwable);
    }

    /**
     * 构造方法
     *
     * @param errorMsg
     *            错误信息
     * @param throwable
     *            异常
     */
    public DxpException(String errorMsg, Throwable throwable) {
        super(errorMsg, throwable);
    }

    /**
     * 构造方法
     *
     * @param exceptionCode
     *            国际化错误码
     * @param errorMsg
     *            错误信息
     */
    public DxpException(String exceptionCode, String errorMsg) {
        super(errorMsg);
        this.exceptionCode = exceptionCode;
    }

    /**
     * 构造方法
     *
     * @param exceptionCode
     *            国际化错误码
     * @param errorMsg
     *            错误信息
     * @param throwable
     *            异常
     */
    public DxpException(String exceptionCode, String errorMsg, Throwable throwable) {
        super(errorMsg, throwable);
        this.exceptionCode = exceptionCode;
    }
}
