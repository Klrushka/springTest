package com.example.springtest.test.javacode;

import com.example.springtest.models.Dog;
import com.example.springtest.models.Person;
import com.example.springtest.models.Pet;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:app.properties")
//@ComponentScan("com.example.springtest")
public class Config {

    @Bean
    @Scope("prototype")
    // beanId = method name
    public Pet dogBean(){
        return new Dog();
    }


    @Bean
    public Person person(){
        return new Person(dogBean());
    }
}
