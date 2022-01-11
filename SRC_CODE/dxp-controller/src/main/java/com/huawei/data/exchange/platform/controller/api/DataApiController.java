package com.huawei.data.exchange.platform.controller.api;

import com.alibaba.fastjson.JSONObject;
import com.huawei.data.exchange.platform.common.util.ResponseUtil;
import com.huawei.data.exchange.platform.service.DataApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/dataapi")
public class DataApiController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataApiController.class);

    @Autowired
    private DataApiService dataApiService;

    @PostMapping(path = "/hello")
    public JSONObject hello() {
        dataApiService.hello();
        return ResponseUtil.buildSuccessResponse("hahaha!");
    }
}
