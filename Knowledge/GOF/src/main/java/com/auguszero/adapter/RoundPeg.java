package com.auguszero.adapter;

/**
 * @author haisong
 * @create 2018/02/12 13:39
 */
public class RoundPeg implements IRoundPeg {

    private static RoundPeg peg ;

    private RoundPeg(){}

    public static RoundPeg getInstance(){
        if(peg==null){
            peg = new RoundPeg();
        }
        return peg;
    }



    @Override
    public void insertRound(String str) {
        System.out.println("RoundPeg insert:"+str);
    }
}
