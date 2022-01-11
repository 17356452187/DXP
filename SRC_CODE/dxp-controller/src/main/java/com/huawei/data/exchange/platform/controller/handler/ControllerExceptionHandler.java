package com.huawei.data.exchange.platform.controller.handler;

import com.alibaba.fastjson.JSONObject;
import com.huawei.data.exchange.platform.common.constant.ResponseConstant;
import com.huawei.data.exchange.platform.common.exception.DxpException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * controller异常处理
 */
@ControllerAdvice
@ResponseBody
public class ControllerExceptionHandler {

    /**
     * 处理DxpException异常
     *
     * @param dxpException
     *            dxpException
     * @return 异常处理结果
     */
    @ExceptionHandler(value = DxpException.class)
    public JSONObject handleDxpException(DxpException dxpException) {
        return buildResult(dxpException.getExceptionCode(), dxpException.getMessage());
    }

    /**
     * 处理Exception异常
     *
     * @param exception
     *            exception
     * @return 异常处理结果
     */
    @ExceptionHandler(value = Exception.class)
    public JSONObject handleDxpException(Exception exception) {
        return buildResult("unknown error", exception.getMessage());
    }

    private JSONObject buildResult(String code, String message) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(ResponseConstant.RESULT_CODE, ResponseConstant.RESULT_FAILED);
        jsonObject.put(ResponseConstant.RESULT_STATUS_CODE, code);
        jsonObject.put(ResponseConstant.RESULT_STATUS_MESSAGE, message);
        return jsonObject;
    }
}
