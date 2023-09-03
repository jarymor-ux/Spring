package com.ostap.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.ostap.aop")
@EnableAspectJAutoProxy
public class MyConfig {

}
