package com.huawei.data.exchange.platform.common.util;

import com.alibaba.fastjson.JSONObject;
import com.huawei.data.exchange.platform.common.constant.ResponseConstant;

/**
 * 响应体生成工具类
 */
public class ResponseUtil {
    /**
     * 生成成功响应体
     *
     * @param dataResult
     *            成功响应结果集
     * @return 成功响应体
     */
    public static JSONObject buildSuccessResponse(Object dataResult) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(ResponseConstant.RESULT_CODE, ResponseConstant.RESULT_SUCCESS);
        jsonObject.put(ResponseConstant.RESULT_STATUS_MESSAGE, ResponseConstant.SUCCESS);
        jsonObject.put(ResponseConstant.RESULT_SET, dataResult);
        return jsonObject;
    }

    /**
     * 生成失败响应体
     *
     * @param errorStatusCode
     *            失败状态码
     * @param errorStatusMsg
     *            失败信息
     * @return 成功响应体
     */
    public static JSONObject buildErrorResponse(String errorStatusCode, String errorStatusMsg) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(ResponseConstant.RESULT_CODE, ResponseConstant.RESULT_FAILED);
        jsonObject.put(ResponseConstant.RESULT_STATUS_MESSAGE, errorStatusCode);
        jsonObject.put(ResponseConstant.RESULT_STATUS_MESSAGE, errorStatusMsg);
        return jsonObject;
    }
}
