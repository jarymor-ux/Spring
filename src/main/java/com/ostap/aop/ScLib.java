package com.ostap.aop;

import org.springframework.stereotype.Component;

@Component
public class ScLib extends AbstractLibruary{
    @Override
    public void getBook() {
        System.out.println("Book is kept in ScLib");
    }
}
