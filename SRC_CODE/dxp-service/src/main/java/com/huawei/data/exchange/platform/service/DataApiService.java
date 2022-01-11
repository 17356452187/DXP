package com.huawei.data.exchange.platform.service;

import com.huawei.data.exchange.platform.common.exception.DxpException;
import com.huawei.data.exchange.platform.common.util.SpringContextUtil;
import com.huawei.data.exchange.platform.dao.DataApiDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataApiService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataApiService.class);

    @Autowired
    private DataApiDao dataApiDao;

    public void hello() {
        try {
            Integer.parseInt("aa");
        } catch (Exception e) {
            LOGGER.error("exception msg is: {}", e.getMessage());
            LOGGER.error("exception: ", e);
            throw new DxpException("101", "exception happened!");
        }
    }
}
