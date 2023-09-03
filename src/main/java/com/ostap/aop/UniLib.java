package com.ostap.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLib extends AbstractLibruary{
    @Override
    public void getBook(){
        System.out.println("Book is kept in UniLib");
    }
}
