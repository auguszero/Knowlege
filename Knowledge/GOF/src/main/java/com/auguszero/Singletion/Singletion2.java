package com.auguszero.Singletion;

/**
 * 单态方式之2
 *
 * @author haisong
 * @create 2018/02/11 10:16
 */
public class Singletion2 {

    //lazy initialization
    private static Singletion2 singletion = null;

    public static synchronized  Singletion2 getSingletion(){
        if(singletion ==null){
            singletion = new Singletion2();
        }
        return  singletion;
    }



}
