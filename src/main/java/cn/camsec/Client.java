/**
 * File : Client.java
 * Copyright (C) 2008-2018 www.oneapm.com . all rights reserved.
 */
package cn.camsec;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;

/**
 * @author : Ron
 * date :2019/11/26:11:27
 * TODO
 * version 1.0
 */
public class Client {
    public static void main(String[] args) {
        ReferenceConfig<GreetingService> reference = new ReferenceConfig<>();
        reference.setApplication(new ApplicationConfig("first-dubbo-consumer"));
        reference.setRegistry(new RegistryConfig("zookeeper://10.128.106.39:2181"));
        reference.setInterface(GreetingService.class);
        GreetingService service = reference.get();
        String message = service.sayHi("dubbo");
        System.out.println(message);
    }
}
