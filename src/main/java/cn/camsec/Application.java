/**
 * File : Application.java
 * Copyright (C) 2008-2018 www.oneapm.com . all rights reserved.
 */
package cn.camsec;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;

import java.util.concurrent.CountDownLatch;

/**
 * @author : Ron
 * date :2019/11/26:11:12
 * TODO
 * version 1.0
 */
public class Application {

    public static void main(String[] args) throws InterruptedException {
        ServiceConfig<GreetingService> service = new ServiceConfig<>();
        service.setApplication(new ApplicationConfig("first-dubbo-provider"));
        service.setRegistry(new RegistryConfig("zookeeper://10.128.106.39:2181"));
        service.setInterface(GreetingService.class);
        service.setRef(new GreetingServiceImpl());
        service.export();

        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
}
