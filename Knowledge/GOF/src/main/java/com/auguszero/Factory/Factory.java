package com.auguszero.Factory;

/**
 * 实例工厂方式
 *
 * @author haisong
 * @create 2018/02/11 10:31
 */
public class Factory {

    public static  Factory creat(int num){
        Factory factory = null;
        switch (num){
            case 1:
                factory = new FactoryA();
            case 2:
                factory = new FactoryB();
        }
        return factory;
    }





}
