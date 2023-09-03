package com.ostap.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLib uniLib = context.getBean("uniLib", UniLib.class);
        ScLib scLib = context.getBean("scLib", ScLib.class);
        scLib.getBook();
        uniLib.getBook();


        context.close();
    }
}
