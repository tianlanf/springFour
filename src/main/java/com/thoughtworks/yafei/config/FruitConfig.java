package com.thoughtworks.yafei.config;

import com.thoughtworks.yafei.domain.Fruit;
import com.thoughtworks.yafei.domain.impl.Apple;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FruitConfig {
    @Bean(name="fruit")
    public Fruit fruit() {
        return new Apple();
    }

}
