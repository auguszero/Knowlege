package com.auguszero.Singletion;

/**
 * 单态
 *
 * @author haisong
 * @create 2018/02/11 10:13
 */
public class Singletion {

    private Singletion(){}

    public static Singletion singletion = new Singletion();

    public static Singletion getInstance(){
        return  singletion;
    }

}
