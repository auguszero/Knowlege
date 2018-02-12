package com.auguszero.builder;

/**
 * 构建实现类
 *
 * @author haisong
 * @create 2018/02/11 13:15
 */
public class ConstructBuilder implements  Builder {
    private Product productA = new ProductA();
    private Product productB = new ProductB();
    private Product productC = new ProductC();

    @Override
    public void buildPartA() {

    }

    @Override
    public void buildPartB() {

    }

    @Override
    public void buildePartC() {

    }

    @Override
    public Product getResult() {
        return null;
    }
}
