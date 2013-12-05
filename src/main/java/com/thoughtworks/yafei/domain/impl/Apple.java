package com.thoughtworks.yafei.domain.impl;

import com.thoughtworks.yafei.domain.Fruit;

public class Apple implements Fruit {
    @Override
    public void printMsg() {
        System.out.println("This is apple");
    }
}
