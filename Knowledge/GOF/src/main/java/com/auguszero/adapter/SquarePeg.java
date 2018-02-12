package com.auguszero.adapter;

/**
 * @author haisong
 * @create 2018/02/12 13:37
 */
public class SquarePeg implements ISquarePeg{

    private static SquarePeg peg ;

    private SquarePeg(){}

    public static SquarePeg getInstance(){
        if(peg==null){
            peg = new SquarePeg();
        }
        return peg;
    }


    @Override
    public void insert(String str) {
        System.out.println("SquarePeg insert "+str);
    }
}
