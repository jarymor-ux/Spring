package com.ostap.SpringIntro;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("com.ostap.SpringIntro")
@PropertySource("classpath:app.properties")
public class Config {
    @Bean
    @Scope(value = "singleton")
    public Pet catBean(){
        return new Cat();
    }
    @Bean
    public Person personBean(){
        return new Person(catBean());
    }


}
