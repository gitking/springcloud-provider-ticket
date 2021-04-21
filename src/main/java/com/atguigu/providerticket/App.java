package com.atguigu.providerticket;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * https://developer.aliyun.com/lesson_1913_16409#_16409
 * 第6章 » 课时35 SpringCloud-Eureka注册中心
 * springcloud-provider-ticket这个项目是服务提供者
 * 注意启动springcloud-provider-ticket这个项目的时候,eureka-server这个项目必须已经正常运行起来了
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
