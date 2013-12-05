package com.thoughtworks.yafei.config;

import com.thoughtworks.yafei.domain.Vegetable;
import com.thoughtworks.yafei.domain.impl.Carrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({FruitConfig.class})
public class VegetableConfig {

    @Bean(name = "vegetable")
    public Vegetable vegetable() {
        return new Carrot();
    }
}
