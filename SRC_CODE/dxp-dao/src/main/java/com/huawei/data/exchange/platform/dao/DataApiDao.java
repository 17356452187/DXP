package com.huawei.data.exchange.platform.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class DataApiDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataApiDao.class);

    public void hello() {
        LOGGER.info("dao: hello dxp!");
    }
}
