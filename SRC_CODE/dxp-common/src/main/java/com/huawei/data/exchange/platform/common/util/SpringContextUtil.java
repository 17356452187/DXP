package com.huawei.data.exchange.platform.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * spring上下文工具类
 */
@Component
public class SpringContextUtil implements ApplicationContextAware {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringContextUtil.class);

    private static ApplicationContext applicationContext;

    private SpringContextUtil() {}

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (SpringContextUtil.applicationContext == null) {
            SpringContextUtil.applicationContext = applicationContext;
        }
    }

    /**
     * 获取spring applicationContext对象
     *
     * @return applicationContext对象
     */
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    /**
     * 通过bean名称获取spring bean
     *
     * @param beanName
     *            bean名称
     * @param <T>
     *            类型
     * @return bean对象
     */
    public static <T> T getBean(String beanName) {
        return (T)getApplicationContext().getBean(beanName);
    }

    /**
     * 通过bean名称获取spring bean
     *
     * @param clazz
     *            bean类型
     * @param <T>
     *            类型
     * @return bean对象
     */
    public static <T> T getBean(Class<T> clazz) {
        LOGGER.info("common: hello dxp!");
        return getApplicationContext().getBean(clazz);
    }

    /**
     * 通过bean名称和类型获取spring bean
     *
     * @param name
     *            bean名称
     * @param clazz
     *            bean类型
     * @param <T>
     *            类型
     * @return bean对象
     */
    public static <T> T getBean(String name, Class<T> clazz) {
        return getApplicationContext().getBean(name, clazz);
    }
}
