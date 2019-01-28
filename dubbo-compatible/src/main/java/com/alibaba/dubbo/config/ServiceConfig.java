/*
 * 服务提供者暴露服务配置类。
 */

package com.alibaba.dubbo.config;

import org.apache.dubbo.config.annotation.Service;

@Deprecated
public class ServiceConfig<T> extends org.apache.dubbo.config.ServiceConfig<T> {

    public ServiceConfig() {
    }

    public ServiceConfig(Service service) {
        super(service);
    }
}
