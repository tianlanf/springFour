package com.thoughtworks.yafei.domain.impl;

import com.thoughtworks.yafei.domain.Vegetable;

public class Carrot implements Vegetable{
    @Override
    public void printMsg() {
        System.out.println("This is carrot");
    }
}
