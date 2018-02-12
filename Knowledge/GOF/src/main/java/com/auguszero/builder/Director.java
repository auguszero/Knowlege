package com.auguszero.builder;

/**
 * 组装过程
 *
 * @author haisong
 * @create 2018/02/11 13:16
 */
public class Director {

    private Builder builder;

    public Director (Builder builder){
        this.builder = builder;
        builder();
    }

    public void builder(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildePartC();
    }

}
