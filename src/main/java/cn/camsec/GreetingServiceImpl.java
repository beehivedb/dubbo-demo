/**
 * File : GreetingServiceImpl.java
 * Copyright (C) 2008-2018 www.oneapm.com . all rights reserved.
 */
package cn.camsec;

/**
 * @author : Ron
 * date :2019/11/26:11:12
 * TODO
 * version 1.0
 */
public class GreetingServiceImpl implements GreetingService {
    public String sayHi(String name) {
        return  "Hello, " + name;
    }
}
