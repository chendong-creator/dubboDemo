package com.cfhz.service.imp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @ClassName MainApplication
 * @Description TODO
 * @Author Administrator
 * @Date2020/1/20 17:37
 */
public class MainApplication {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext ioc=	new ClassPathXmlApplicationContext("provider.xml");
        ioc.start(); //启动容器

        System.in.read();  //阻塞一下
    }

}
